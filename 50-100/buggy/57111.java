@java.lang.Override
public java.lang.Number apply(final java.math.BigDecimal a, final java.math.BigDecimal b) {
    try {
        return a.divide(b);
    } catch (final java.lang.ArithmeticException ae) {
        return java.lang.Double.valueOf(((a.doubleValue()) / (b.doubleValue())));
    }
}