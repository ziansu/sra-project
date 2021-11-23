private double calculateIDF(double N, double n_t) {
    return java.lang.Math.log((N / (n_t + 1)));
}