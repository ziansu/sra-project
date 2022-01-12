private static final int hash(final java.lang.Object key) {
    int h = key.hashCode();
    h ^= (h >>> 20) ^ (h >>> 12);
    h ^= (h >>> 7) ^ (h >>> 4);
    return h;
}