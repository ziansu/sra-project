public static final short readShortLittleEndian(byte[] array, int pos) {
    short result = ((short) (array[(pos + 1)]));
    result <<= 8;
    result |= ((short) (array[pos])) & 255;
    return result;
}