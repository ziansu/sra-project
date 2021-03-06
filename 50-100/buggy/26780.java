private byte[] longToByteArray(long value) {
    byte[] result = new byte[8];
    for (int i = 7; i >= 0; --i) {
        result[i] = ((byte) ((int) (value & 255L)));
        value >>= 8;
    }
    return result;
}