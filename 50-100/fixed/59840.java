public static final short b2s(byte[] bytes, int start) {
    return ((short) (((bytes[start]) << 8) | ((bytes[(start + 1)]) & 255)));
}