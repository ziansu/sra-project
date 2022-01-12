@java.lang.Override
protected int resumeRaw(int crc, byte[] input, int index, int length) {
    for (int i = 0; i < length; ++i)
        crc = (table[((crc ^ (input[(index + i)])) & 255)]) ^ (crc >>> 8);
    
    return crc;
}