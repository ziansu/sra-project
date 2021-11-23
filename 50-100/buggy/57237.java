public static byte[] bytesStripRight(byte[] bytes, byte padByte) {
    int newLen = bytes.length;
    while (((bytes[(newLen - 1)]) == padByte) && (newLen > 0))
        newLen--;
    
    return java.util.Arrays.copyOf(bytes, newLen);
}