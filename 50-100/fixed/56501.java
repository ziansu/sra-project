public static void findFloorAndCeiling() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println(("This program will ask you to enter a decimal number, " + "and then it will tell you the result of rounding it up and down"));
    java.lang.System.out.println("Enter a number: ");
    double dob = scanner.nextDouble();
    java.lang.System.out.println(("The number rounded up is: " + ((int) (java.lang.Math.ceil(dob)))));
    java.lang.System.out.println(("The number rounded down is: " + ((int) (java.lang.Math.floor(dob)))));
    java.lang.System.out.println("");
}