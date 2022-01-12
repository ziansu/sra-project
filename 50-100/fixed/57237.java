public static byte[] bytesStripRight(byte[] bytes, byte padByte) {
    int newLen = bytes.length;
    while ((newLen > 0) && ((bytes[(newLen - 1)]) == padByte))
        newLen--;
    
    return java.util.Arrays.copyOf(bytes, newLen);
}