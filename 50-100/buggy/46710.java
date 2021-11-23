public void addFactoryCat(int idx) {
    int pos = idx / 64;
    int offs = idx % 64;
    if (pos >= (key.length)) {
        key = java.util.Arrays.copyOf(key, (pos + 1));
    }
    key[pos] |= 1L << offs;
}