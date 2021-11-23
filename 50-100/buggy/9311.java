public static org.organicdesign.fp.collections.interfaces.UnmodSortedIterable castFromSortedMap(final java.util.SortedMap sm) {
    return () -> new org.organicdesign.fp.collections.interfaces.UnmodSortedIterator() {
        java.util.Iterator iter = sm.entrySet().iterator();

        @java.lang.Override
        public boolean hasNext() {
            return iter.hasNext();
        }

        @java.lang.Override
        public java.lang.Object next() {
            return iter.next();
        }
    };
}