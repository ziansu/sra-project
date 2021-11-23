private static final long unsignedIntToLong(byte[] b) {
    long value = 0;
    for (byte data : b) {
        value <<= 8;
        value += data & 255;
    }
    return value;
}