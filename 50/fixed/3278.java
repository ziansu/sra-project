private static byte clearBit(byte b, int pos) {
    b &= ((byte) (~(1 << pos)));
    return b;
}