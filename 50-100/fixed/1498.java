private double[] getMinMax(double[] inputColumnAsNumbers) {
    double min = java.lang.Double.MAX_VALUE;
    double max = -(java.lang.Double.MAX_VALUE);
    for (int i = 0; i < (inputColumnAsNumbers.length); i++) {
        double value = inputColumnAsNumbers[i];
        min = java.lang.Math.min(min, value);
        max = java.lang.Math.max(max, value);
    }
    return new double[]{ min , max };
}