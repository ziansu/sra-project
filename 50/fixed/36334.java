private java.math.BigDecimal calculateRight3(java.math.BigDecimal n) {
    return big(2).pow(6).divide(big(10).multiply(n).add(big(3)), context).negate();
}