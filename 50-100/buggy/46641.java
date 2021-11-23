public static void main(java.lang.String[] args) {
    int length = java.lang.Integer.parseInt(args[0]);
    int width = java.lang.Integer.parseInt(args[1]);
    Rectanle myRectangle = new Rectangle(length, width);
    java.lang.System.out.println(("My rectangle area = " + (myRectangle.getArea())));
    java.lang.System.out.println(("My rectangle perimeter = " + (myRectangle.getPerimeter())));
}