private double calcAlpha(double x, double y) {
    if (x == 0) {
        return 1.0;
    }
    return java.lang.Math.atan((y / x));
}