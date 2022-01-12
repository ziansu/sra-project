private double calculateHeight(double alpha, double betta, double a) {
    double h = roundNumber((a * (java.lang.Math.tan(java.lang.Math.toRadians(alpha)))), 2);
    double h1 = roundNumber((a * (java.lang.Math.tan(java.lang.Math.toRadians(betta)))), 2);
    return h + h1;
}