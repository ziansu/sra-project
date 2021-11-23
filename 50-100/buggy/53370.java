private long[] createPostFix(long[] val, int posDiff) {
    int preLen = posDiff >>> 6;
    long[] p = new long[(val.length) - preLen];
    java.lang.System.arraycopy(val, preLen, p, 0, p.length);
    return p;
}