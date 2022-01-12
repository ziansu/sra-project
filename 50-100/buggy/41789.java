public static double[] xGenerator() {
    int rand = ((int) (java.lang.Math.round(((java.lang.Math.random()) * 7)))) + 3;
    double[] x = new double[rand];
    for (int i = 0; i < (x.length); i++) {
        x[i] = java.lang.Math.round(java.lang.Math.random());
    }
    return x;
}