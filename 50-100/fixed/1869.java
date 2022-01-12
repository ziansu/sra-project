public static byte[] encodeLong(long value) {
    byte[] result = new byte[8];
    for (int i = 7; i >= 0; i--) {
        result[i] = ((byte) (value & 255L));
        value >>= 8;
    }
    return result;
}