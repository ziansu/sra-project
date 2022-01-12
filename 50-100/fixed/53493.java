public static void main(java.lang.String[] args) {
    java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Enter a positive integer number:");
    int num = in.nextInt();
    java.lang.String hex = java.lang.Integer.toHexString(num);
    hex = hex.toUpperCase();
    java.lang.System.out.println(("The hexadecimal value of the number is " + hex));
    in.close();
}