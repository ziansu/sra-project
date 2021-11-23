public java.math.BigInteger toBigInteger() {
    final byte[] barr = new byte[21];
    barr[0] = 0;
    java.lang.System.arraycopy(getBytes(), 0, barr, 1, 20);
    return new java.math.BigInteger(barr);
}