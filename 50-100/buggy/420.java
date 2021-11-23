public static short readSignedShort(byte[] bytes, int offset) {
    int ch1 = bytes[offset];
    int ch2 = bytes[(offset + 1)];
    if (ch1 < 0)
        ch1 += 256;
    
    if (ch2 < 0)
        ch1 += 256;
    
    return ((short) ((ch1 << 8) + (ch2 << 0)));
}