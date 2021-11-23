public static boolean outsideCicle(int r, int x, int y) {
    double distance = java.lang.Math.sqrt(((x * x) + (y * y)));
    return distance >= r;
}