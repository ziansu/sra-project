public static int readUnsigned(java.nio.ByteBuffer in, int size) {
    int integer = 0;
    for (int i = 0; i < size; i++) {
        integer = integer << 8;
        integer += in.get();
    }
    return integer;
}