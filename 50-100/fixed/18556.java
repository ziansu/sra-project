private double getStdrDeviation(double[] values) {
    double mean = getMean(values);
    double aux = 0;
    for (double a : values) {
        aux += (a - mean) * (a - mean);
    }
    return java.lang.Math.sqrt((aux / (values.length)));
}