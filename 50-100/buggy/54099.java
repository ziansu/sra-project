protected double[] derivative(double[] coefs) {
    int length = coefs.length;
    double[] dCoefs = new double[length - 1];
    for (int i = 1; i < length; i++) {
        dCoefs[(i - 1)] = (coefs[i]) * i;
    }
    return dCoefs;
}