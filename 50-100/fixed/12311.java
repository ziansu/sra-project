public static void findEvenOrOdd() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println(("This program will ask you for a number, and will then" + " tell you if it is even or odd"));
    int evenCheck;
    java.lang.System.out.println("Enter a number:");
    int evenNum = scanner.nextInt();
    evenCheck = evenNum % 2;
    if (evenCheck == 0) {
        java.lang.System.out.println("Even");
    }else {
        java.lang.System.out.println("Odd");
    }
    java.lang.System.out.println("");
}