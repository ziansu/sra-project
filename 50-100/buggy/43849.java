public static org.organicdesign.fp.collections.interfaces.UnmodSortedIterable castFromList(java.util.List ss) {
    return () -> new org.organicdesign.fp.collections.interfaces.UnmodSortedIterator() {
        java.util.Iterator iter = ss.iterator();

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