private java.lang.String multiply(java.lang.String x, java.lang.String y) {
    java.math.BigDecimal i = new java.math.BigDecimal(getValue(x).toString());
    java.math.BigDecimal j = new java.math.BigDecimal(getValue(y).toString());
    java.math.BigDecimal k = i.multiply(j);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}