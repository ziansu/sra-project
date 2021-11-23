public java.math.BigInteger toBigInteger() {
    final byte[] barr = new byte[(getBytes().length) + 1];
    barr[0] = 0;
    java.lang.System.arraycopy(getBytes(), 0, barr, 1, getBytes().length);
    return new java.math.BigInteger(barr);
}