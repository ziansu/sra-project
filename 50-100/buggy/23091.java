public static void main(java.lang.String[] args) {
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Enter the radius of a circle");
    float radius = scan.nextFloat();
    double area = (2 * 3.14159265) * radius;
    double circumference = (3.14159265 * radius) ^ 2.0;
    java.lang.System.out.println(((("The area is: " + area) + "The circumference is: ") + circumference));
}