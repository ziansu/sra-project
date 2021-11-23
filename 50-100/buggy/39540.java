public static void main(java.lang.String[] args) {
    int num;
    int num2;
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Enter a number ");
    num = input.nextInt();
    java.lang.System.out.print("Enter another number ");
    num2 = input.nextDouble();
    if (((num % num2) == 0) | ((num2 % num) == 0))
        java.lang.System.out.println("One of these numbers is evenly divisible into the other");
    else
        java.lang.System.out.println("Neither of these numbers is evenly divisible into the other");
    
}