public static byte[] parse(final char value) {
    final byte[] bytes = new byte[2];
    bytes[0] = ((byte) (value >>> 8));
    bytes[1] = ((byte) (value));
    return bytes;
}