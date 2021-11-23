private java.lang.String subtract(java.lang.String x, java.lang.String y) {
    java.math.BigDecimal i = new java.math.BigDecimal(getValue(x).toString());
    java.math.BigDecimal j = new java.math.BigDecimal(getValue(y).toString());
    java.math.BigDecimal k = j.subtract(i);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}