@java.lang.Override
public java.math.BigDecimal calculateDigitsFrom(int n, int digits) {
    java.math.BigDecimal scale = big(10).pow(((n + digits) - 1));
    return calculateFrom(n, digits).multiply(scale).stripTrailingZeros();
}