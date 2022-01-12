public static int readUnsigned(java.nio.ByteBuffer in, int size) {
    int integer = 0;
    int mask = 255;
    int shift = 0;
    for (int i = 0; i < size; i++) {
        integer |= ((in.get()) << shift) & mask;
        mask = mask << 8;
        shift += 8;
    }
    return integer;
}