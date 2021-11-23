public static int bigToLittleEndian(int data) {
    int value;
    value = ((((data >> 24) & 255) | ((data >> 8) & 65280)) | ((data << 8) & 16711680)) | ((data << 24) & -16777216);
    return value;
}