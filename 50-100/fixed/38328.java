static double poly(double[] c, double x) {
    double sum = 0.0;
    for (int i = 0; i < (c.length); i++) {
        sum += (c[i]) * (java.lang.Math.pow(x, i));
    }
    return sum;
}