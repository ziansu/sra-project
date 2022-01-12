public static double[] xGenerator(int n) {
    double[] x = new double[n];
    for (int i = 0; i < (x.length); i++) {
        x[i] = java.lang.Math.round(java.lang.Math.random());
    }
    return x;
}