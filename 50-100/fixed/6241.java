private static byte reverseBitsInByte(final byte val) {
    byte tmp = val;
    byte result = 0;
    int counter = 8;
    while ((counter--) > 0) {
        result <<= 1;
        result |= ((byte) (tmp & 1));
        tmp = ((byte) (tmp >> 1));
    } 
    return result;
}