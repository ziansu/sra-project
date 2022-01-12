public int getDerivativeCoefficient(int order, int exponent) {
    int coeff = 1;
    for (int i = exponent; i > (exponent - order); i--) {
        coeff *= i;
    }
    return coeff;
}