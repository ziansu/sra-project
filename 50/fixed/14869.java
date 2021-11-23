private java.lang.String negate(java.lang.String x) {
    java.math.BigDecimal i = new java.math.BigDecimal(getValue(x).toString());
    java.math.BigDecimal k = i.negate();
    k = k.stripTrailingZeros();
    return k.toPlainString();
}