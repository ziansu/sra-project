private void encodeByteMap(boolean[] b, int offset) {
    int n = 0;
    for (int i = 0; i < 32; i++) {
        if (b[(offset + i)]) {
            n |= 1 << i;
        }
    }
    encodeInt(n);
}