private static int bucketIndex(java.lang.String key, int bucketsNumber) {
    int initialHash = key.hashCode();
    final int bitsInInteger = 32;
    final int minIntegerAbs = 1 << (bitsInInteger - 1);
    if (initialHash < 0) {
        initialHash += minIntegerAbs;
    }
    return initialHash % bucketsNumber;
}