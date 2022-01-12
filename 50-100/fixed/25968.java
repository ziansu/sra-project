public static final short readShortBigEndian(byte[] array, int pos) {
    short temp = ((short) (array[pos]));
    temp <<= 8;
    temp |= ((short) (array[(pos + 1)])) & 255;
    return temp;
}