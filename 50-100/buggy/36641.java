private java.lang.String multiply(java.lang.String x, java.lang.String y) {
    java.math.BigDecimal i = new java.math.BigDecimal(x);
    java.math.BigDecimal j = new java.math.BigDecimal(y);
    java.math.BigDecimal k = i.multiply(j);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}