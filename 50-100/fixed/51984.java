org.passay.dictionary.AbstractFileWordList.Cache.Entry get(final int index) {
    if (((modulus) == 0) || (index < (modulus))) {
        return new org.passay.dictionary.AbstractFileWordList.Cache.Entry(0, 0);
    }
    final int i = index / (modulus);
    map.position(i);
    return new org.passay.dictionary.AbstractFileWordList.Cache.Entry((i * (modulus)), map.get());
}