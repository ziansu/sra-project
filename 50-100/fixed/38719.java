public double divided(double divider, double dividend) {
    double quotient = -1;
    try {
        quotient = divider / dividend;
    } catch (java.lang.ArithmeticException ImpossibleDividedByZero) {
        Camera.LOG.severe(erroDividedByZero());
        java.lang.System.err.println(erroDividedByZero());
        divided(divider, dividend);
    }
    return quotient;
}