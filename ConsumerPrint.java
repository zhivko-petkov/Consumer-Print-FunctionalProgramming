package EXERCISE;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("\\s+");
        Consumer<String> print = name -> System.out.println(name);
        for (var name : names) {
            print.accept(name);
        }
    }
}
