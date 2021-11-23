public java.math.BigDecimal calculateAddend(int n) {
    return calculateLeft(n).multiply(calculateRight(big(n)));
}