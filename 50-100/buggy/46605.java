public double calculatePerimeter() {
    if (((width) < 0) && ((height) < 0)) {
        java.lang.System.out.println("Invalid values");
        return 0;
    }
    return (2 * (width)) + (2 * (height));
}