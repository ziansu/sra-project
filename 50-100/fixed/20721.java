public static void main(java.lang.String[] args) {
    java.lang.System.out.print("Enter a temp. in Celsius");
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    double celsius = input.nextDouble();
    double fahrenheit = ((9 / 5) * celsius) + 32;
    java.lang.System.out.println((((celsius + "Celsius is") + " ") + fahrenheit));
}