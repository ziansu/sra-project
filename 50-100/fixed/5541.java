public static byte[] toByteArray(int value, int length) {
    byte[] result = new byte[length];
    for (int i = 0; (i < 4) && (i < length); i++) {
        result[((length - 1) - i)] = ((byte) ((value >> (8 * i)) & 255));
    }
    return result;
}