private double getMean() {
    double[] values = getValues();
    double result = 1.0;
    for (int i = 0; i < (values.length); i++) {
        result *= java.lang.Math.pow(((values[i]) + 1.0), (1.0 / ((double) (values.length))));
    }
    return result - 1.0;
}