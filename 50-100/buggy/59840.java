public static final short b2s(byte[] bytes, int start) {
    short r = 0;
    r = ((short) (((bytes[start]) << 8) | ((bytes[(start + 1)]) & 255)));
    return r;
}