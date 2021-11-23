private static byte reverseBitsInByte(byte val) {
    byte result = 0;
    int counter = 8;
    while ((counter--) > 0) {
        result <<= 1;
        result |= ((byte) (val & 1));
        val = ((byte) (val >> 1));
    } 
    return result;
}