public static final short readShortLittleEndian(byte[] array, int pos) {
    short result = 0;
    result += (array[(pos + 1)]) & 255;
    result <<= 8;
    result += (array[pos]) & 255;
    return result;
}