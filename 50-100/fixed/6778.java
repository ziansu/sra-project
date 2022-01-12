public static void main(java.lang.String[] args) {
    int length = java.lang.Integer.parseInt(args[0]);
    int width = java.lang.Integer.parseInt(args[1]);
    Rectangle myRectangle = new Rectangle(length, width);
    java.lang.String output = java.lang.String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d/nArea: %d/nPerimeter: %d/nArea: %d/n/n", myRectangle.length, myRectangle.width, myRectangle.getPerimeter(), myRectangle.getArea());
    java.lang.System.out.println(output);
}