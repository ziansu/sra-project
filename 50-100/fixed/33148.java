private java.lang.String exponent(java.lang.String x, java.lang.String y) {
    double i = getValue(x);
    double j = getValue(y);
    java.math.BigDecimal k = new java.math.BigDecimal(java.lang.Math.pow(j, i), java.math.MathContext.DECIMAL64);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}