public static void multiplyTwoNumbers() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println(("The following program will ask you to give it two " + "numbers, which it will then multiply them and tell you the product"));
    int multiplyAnyTwoNumbersProduct;
    java.lang.System.out.println("Enter the 1st number:");
    int multiplyAnyTwoNumbers1 = scanner.nextInt();
    java.lang.System.out.println("Enter the 2nd number:");
    int multiplyAnyTwoNumbers2 = scanner.nextInt();
    multiplyAnyTwoNumbersProduct = multiplyAnyTwoNumbers1 * multiplyAnyTwoNumbers2;
    java.lang.System.out.println(("The product of the two numbers is: " + multiplyAnyTwoNumbersProduct));
    java.lang.System.out.println("");
    scanner.close();
}