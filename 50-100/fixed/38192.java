public static final int readIntBigEndian(byte[] array, int pos) {
    int temp = ((int) (array[pos]));
    temp <<= 8;
    temp |= (array[(++pos)]) & 255;
    temp <<= 8;
    temp |= (array[(++pos)]) & 255;
    temp <<= 8;
    temp |= (array[(++pos)]) & 255;
    return temp;
}