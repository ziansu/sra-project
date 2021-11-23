private byte[] concat(byte[] a, byte[] b) {
    int aLen = a.length;
    int bLen = b.length;
    byte[] c = new byte[aLen + bLen];
    java.lang.System.arraycopy(a, 0, c, 0, aLen);
    java.lang.System.arraycopy(b, 0, c, aLen, bLen);
    return c;
}