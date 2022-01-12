public static double area(double xc, double yc, double xp, double yp) {
    return ValueMethods.area(ValueMethods.distance(xc, yc, xp, yp));
}