public static double rootMeansSquaredError(double[] real, double[] predicted) {
    double ret = 0.0;
    for (int i = 0; i < (real.length); i++) {
        ret += java.lang.Math.pow(((real[i]) - (predicted[i])), 2);
    }
    return java.lang.Math.sqrt((ret / (real.length)));
}