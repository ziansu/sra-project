public double getDistance(double[] values) {
    double d = 0.0;
    for (int i = 0; i < (this.weights.length); i++) {
        d += java.lang.Math.pow(((this.weights[i]) - (values[i])), 2);
    }
    return java.lang.Math.sqrt(d);
}