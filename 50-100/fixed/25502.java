private int byteArrayToInt(byte[] b) {
    return (((((b[0]) & 255) << 0) | (((b[1]) & 255) << 8)) | (((b[2]) & 255) << 16)) | (((b[3]) & 255) << 24);
}