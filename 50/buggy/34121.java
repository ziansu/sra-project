private double calculateSum(java.util.List<java.lang.Number> values) throws io.tiler.internal.queries.expressions.InvalidExpressionException {
    double sum = 0;
    for (java.lang.Number value : values) {
        sum = sum + (value.doubleValue());
    }
    return sum;
}