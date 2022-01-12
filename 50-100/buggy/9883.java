public static byte[] parse(final int value) {
    final byte[] bytes = new byte[4];
    bytes[0] = ((byte) (value << 24));
    bytes[1] = ((byte) (value << 16));
    bytes[2] = ((byte) (value << 8));
    bytes[3] = ((byte) (value));
    return bytes;
}