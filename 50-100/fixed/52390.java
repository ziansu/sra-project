public void update(byte[] in, int inOff, int len) throws java.lang.IllegalStateException, org.bouncycastle.crypto.DataLengthException {
    if ((inOff + len) > (in.length)) {
        throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
    }
    for (int i = 0; i < len; i++) {
        update(in[(inOff + i)]);
    }
}