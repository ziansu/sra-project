private static java.math.BigDecimal getInitialApproximation(java.math.BigDecimal n) {
    java.math.BigInteger integerPart = n.toBigInteger();
    int length = integerPart.toString().length();
    if ((length % 2) == 0) {
        length--;
    }
    length /= 2;
    return uk.ac.standrews.cs.utilities.archive.BigSquareRoot.ONE.movePointRight(length);
}