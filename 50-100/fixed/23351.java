@java.lang.Override
protected double getAggregate() {
    double[] values = getValues();
    double[] weights = getWeights();
    double result = 1.0;
    for (int i = 0; i < (values.length); i++) {
        result *= java.lang.Math.pow((((values[i]) * (weights[i])) + 1.0), (1.0 / ((double) (values.length))));
    }
    return result - 1.0;
}