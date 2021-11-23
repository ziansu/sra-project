@java.lang.Override
public java.math.BigDecimal convert(java.math.BigDecimal value, java.math.MathContext ctx) throws java.lang.ArithmeticException {
    int nbrDigits = ctx.getPrecision();
    if (nbrDigits == 0)
        throw new java.lang.ArithmeticException("Pi multiplication with unlimited precision");
    
    java.math.BigDecimal pi = tec.uom.se.function.PiMultiplierConverter.Pi.pi(nbrDigits);
    return value.multiply(pi, ctx).scaleByPowerOfTen((1 - nbrDigits));
}