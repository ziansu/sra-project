private static byte[] numberToBytes(long size) {
    byte[] re = new byte[4];
    for (int i = 0; i < 4; i++) {
        re[i] = 0;
        re[i] |= size >> (i * 8);
    }
    return re;
}