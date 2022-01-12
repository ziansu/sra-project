org.passay.dictionary.AbstractFileWordList.Cache.Entry get(final int index) {
    if ((modulus) == 0) {
        return new org.passay.dictionary.AbstractFileWordList.Cache.Entry(0, 0);
    }
    final int i = index / (modulus);
    map.position(i);
    return new org.passay.dictionary.AbstractFileWordList.Cache.Entry(i, map.get());
}