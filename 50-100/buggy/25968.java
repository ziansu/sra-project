public static final short readShortBigEndian(byte[] array, int pos) {
    short temp = 0;
    temp |= (array[pos]) & 255;
    temp <<= 8;
    temp |= (array[(pos + 1)]) & 255;
    return temp;
}