public static double calcDistBetweenPoints(org.opencv.core.Point a, org.opencv.core.Point b) {
    double dx = (a.x) - (b.x);
    double dy = (a.y) - (b.y);
    return java.lang.Math.sqrt(((dx * dx) + (dy * dy)));
}