public static double evaluateSphere(double[] z) {
    double sumOfSquares = 0.0;
    for (int i = 0; i < (z.length); i++) {
        double xi = z[i];
        sumOfSquares = sumOfSquares + (xi * xi);
    }
    return sumOfSquares;
}