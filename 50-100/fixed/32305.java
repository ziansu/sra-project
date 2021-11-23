public static final int readIntLittleEndian(byte[] array, int pos) {
    pos += 3;
    int temp = array[pos];
    temp <<= 8;
    temp |= (array[(--pos)]) & 255;
    temp <<= 8;
    temp |= (array[(--pos)]) & 255;
    temp <<= 8;
    temp |= (array[(--pos)]) & 255;
    return temp;
}