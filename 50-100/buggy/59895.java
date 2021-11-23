public double[] regress() {
    final double slope = (sumXY) / (sumXX);
    if (hasIntercept) {
        return new double[]{ ((sumY) - (slope * (sumX))) / (n) , slope };
    }
    return new double[]{ slope };
}