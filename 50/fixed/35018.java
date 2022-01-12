private java.math.BigDecimal calculateRight1(java.math.BigDecimal n) {
    return big(1).divide(big(4).multiply(n).add(big(3)), context).negate();
}