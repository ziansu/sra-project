static double poly(double[] c, double x) {
    double sum = 0;
    for (int i = 0; i < (x + 1); i++) {
        c[i] *= java.lang.Math.pow(x, i);
        sum += c[i];
    }
    return sum;
}