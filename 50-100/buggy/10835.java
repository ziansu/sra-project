public static <T> boolean noneOf(final java.lang.Iterable<T> source, final int begin, final int end, java.util.function.Predicate<T> pred) {
    final java.util.Iterator<T> iter = getIteratorAtIndex(source, begin);
    for (int i = begin; i != end; ++i) {
        assert iter.hasNext();
        if (pred.test(iter.next())) {
            return true;
        }
    }
    return false;
}