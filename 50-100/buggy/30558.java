private static double logSumExp(final double[] prediction) {
    double sum = 0.0;
    for (int i = 0; i < (prediction.length); i++) {
        sum += java.lang.Math.exp(prediction[i]);
    }
    return java.lang.Math.log(sum);
}