private double inner_product(double[] d1, double[] d2, double initial) throws java.security.InvalidParameterException {
    if ((d1.length) != (d1.length)) {
        throw new java.security.InvalidParameterException("The arrays are not the same length");
    }
    double val = initial;
    for (int i = 0; i < (d1.length); i++) {
        val += (d1[i]) * (d2[i]);
    }
    return val;
}