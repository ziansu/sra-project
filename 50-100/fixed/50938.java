public double[] normalizeFT(double[] copy, double std) {
    double normalisingFactor = (std > 0 ? 1.0 / std : 1.0) * (this.norm);
    int sign = 1;
    for (int i = 0; i < (copy.length); i++) {
        copy[i] *= sign * normalisingFactor;
        sign *= -1;
    }
    return copy;
}