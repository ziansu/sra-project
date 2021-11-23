public static void main(java.lang.String[] args) {
    int number;
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Please enter a number>>> ");
    number = input.nextInt();
    if ((number % 2) == 0) {
        java.lang.System.out.println("Your number was even");
    }else
        java.lang.System.out.println("Your number is odd");
    
}