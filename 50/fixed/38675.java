public E find(final E elem) {
    final java.util.Set<E> set = mEquivalenceClass.get(elem);
    if (set == null) {
        return null;
    }
    return mRepresentative.get(set);
}