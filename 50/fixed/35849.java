public static int byteToPercentage(byte mByte) {
    return ((mByte & 255) * 100) / 255;
}