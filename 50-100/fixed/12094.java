public void reset() {
    bufferPos = 0;
    f0 = 0L;
    t0 = 0L;
    t1 = 0L;
    chainValue = null;
    org.bouncycastle.util.Arrays.fill(buffer, ((byte) (0)));
    if ((key) != null) {
        java.lang.System.arraycopy(key, 0, buffer, 0, key.length);
        bufferPos = org.bouncycastle.crypto.digests.Blake2bDigest.BLOCK_LENGTH_BYTES;
    }
    init();
}