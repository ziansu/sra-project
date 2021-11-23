public static void main(java.lang.String[] args) {
    java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Please enter a number");
    int input = in.nextInt();
    int sum = 0;
    while (input != 0) {
        sum = input + sum;
        java.lang.System.out.println("Please enter a number");
        input = in.nextInt();
    } 
    java.lang.System.out.println(("Your total is: " + sum));
}