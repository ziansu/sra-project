private java.lang.String divide(java.lang.String x, java.lang.String y) {
    java.math.BigDecimal i = new java.math.BigDecimal(x);
    java.math.BigDecimal j = new java.math.BigDecimal(y);
    java.math.BigDecimal k = j.divide(i, java.math.MathContext.DECIMAL64);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}