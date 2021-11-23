public static final int readIntLittleEndian(byte[] array, int pos) {
    return (((((array[(pos + 3)]) & 255) << 24) | (((array[(pos + 2)]) & 255) << 16)) | (((array[(pos + 1)]) & 255) << 8)) | ((array[pos]) & 255);
}