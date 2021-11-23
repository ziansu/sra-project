private boolean isBSTLeft(long x, java.lang.Long min, java.lang.Long max) {
    if (!(keyLeftMap.containsKey(x))) {
        return true;
    }
    long key = keyLeftMap.get(x);
    return isBST(key, java.lang.Long.valueOf(x), max);
}