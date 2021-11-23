public static int bigToLittleEndian(int data) {
    int value = 0;
    value = ((((data & -16777216) >> 24) | ((data & 16711680) >> 8)) | ((data & 65280) << 8)) | ((data & 255) << 24);
    return value;
}