lab9.ULLMap<K, V>.Entry get(K k) {
    if ((k != null) && (k.equals(key))) {
        return this;
    }
    if ((next) == null) {
        return null;
    }
    return next.get(key);
}