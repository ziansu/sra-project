private static final long unsignedIntToLong(byte[] b) {
    long value = 0L;
    if (b != null) {
        for (byte data : b) {
            value <<= 8;
            value += data & 255;
        }
    }
    return value;
}