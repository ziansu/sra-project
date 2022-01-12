private java.lang.String sin(java.lang.String x) {
    java.lang.Double d = java.lang.Double.parseDouble(x);
    if (!(rad)) {
        d = java.lang.Math.toRadians(d);
        java.lang.System.out.println(("hi" + d));
    }
    java.math.BigDecimal k = new java.math.BigDecimal(java.lang.Math.sin(d), java.math.MathContext.DECIMAL64);
    k = k.stripTrailingZeros();
    return k.toPlainString();
}