private double calculateAggregateError(double[] results, double[] expectedResults) {
    double error = 0;
    for (int i = 0; i < (results.length); i++) {
        error += java.lang.Math.pow(((expectedResults[i]) - (results[i])), 2);
    }
    return error / (results.length);
}