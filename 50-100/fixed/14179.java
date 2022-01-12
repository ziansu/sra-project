public static int SynchsafeInt2Integer(byte[] data, int offset) {
    int v = 0;
    for (int i = 0; i < 4; i++) {
        v = (v << 7) | ((data[(offset + i)]) & 127);
    }
    return v;
}