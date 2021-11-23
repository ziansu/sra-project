public static void findSimpleInterest() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println(("This program will tell you how much annual interest " + "you will make, given the original investment and interest rate"));
    double principal;
    double rate;
    double interest;
    java.lang.System.out.println("Enter the initial investment: ");
    principal = scanner.nextDouble();
    java.lang.System.out.println("Enter the annual interest rate: ");
    rate = scanner.nextDouble();
    interest = principal * (rate / 100);
    principal = principal + interest;
    java.lang.System.out.println(("The value of the investment after one year is: " + principal));
    java.lang.System.out.println("");
}