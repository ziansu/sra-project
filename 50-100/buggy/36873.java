private java.lang.String add(java.lang.String x, java.lang.String y) {
    java.math.BigDecimal i = new java.math.BigDecimal(x);
    java.math.BigDecimal j = new java.math.BigDecimal(y);
    java.math.BigDecimal k = i.add(j);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}