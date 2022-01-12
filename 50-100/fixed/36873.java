private java.lang.String add(java.lang.String x, java.lang.String y) {
    java.math.BigDecimal i = new java.math.BigDecimal(getValue(x).toString());
    java.math.BigDecimal j = new java.math.BigDecimal(getValue(y).toString());
    java.math.BigDecimal k = i.add(j);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}