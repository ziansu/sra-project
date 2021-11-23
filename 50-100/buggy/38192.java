public static final int readIntBigEndian(byte[] array, int pos) {
    int temp = 0;
    temp |= (array[pos]) & 255;
    temp <<= 8;
    temp |= (array[(pos + 1)]) & 255;
    temp <<= 8;
    temp |= (array[(pos + 2)]) & 255;
    temp <<= 8;
    temp |= (array[(pos + 3)]) & 255;
    return temp;
}