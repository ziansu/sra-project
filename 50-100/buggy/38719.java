public double divided(double divider, double dividend) {
    assert divider == 0;
    assert dividend == 0;
    assert divider < (Camera.LARGER_SIZE_FOR_A_DOUBLE_VARIABLE);
    assert divider > (Camera.MINIMUM_MOST_FOR_A_DOUBLE_VARIABLE);
    double quotient = -1;
    try {
        Camera.LOG.warning("Fazendo divisão");
        quotient = divider / dividend;
    } catch (java.lang.ArithmeticException ImpossibleDividedByZero) {
        Camera.LOG.severe(erroDividedByZero());
        java.lang.System.err.println(erroDividedByZero());
        divided(divider, dividend);
    }
    return quotient;
}