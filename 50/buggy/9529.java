public void multiply(java.lang.String in) {
    java.math.BigDecimal multiplicand = new java.math.BigDecimal(in);
    total = total.subtract(multiplicand);
}