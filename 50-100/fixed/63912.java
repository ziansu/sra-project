public static double evaluateRastrigin(double[] z) {
    double returnValue = 0;
    for (int i = 0; i < (z.length); i++) {
        double xi = z[i];
        returnValue += (xi * xi) - (10.0 * (java.lang.Math.cos(((2.0 * (java.lang.Math.PI)) * xi))));
    }
    return returnValue + 10.0;
}