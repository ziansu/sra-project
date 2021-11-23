@java.lang.Override
public java.lang.String getAntiForgeryStateToken() {
    final int numberOfBits = 130;
    final int radix = 130;
    return "facebook" + (new java.math.BigInteger(numberOfBits, new java.security.SecureRandom()).toString(radix));
}