void setCoefficients(int[] coef) {
    for (int i = 0; i < (coef.length); i++) {
        coefficients.set(i, this.set(coef[i]));
    }
}