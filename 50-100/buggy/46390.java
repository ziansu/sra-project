public static <T> T last(final java.lang.Iterable<? extends T> source) {
    java.util.Iterator<? extends T> it = source.iterator();
    try {
        if (it.hasNext()) {
            T t = null;
            while (it.hasNext()) {
                t = it.next();
            } 
            return t;
        }
    } finally {
        ix.internal.operators.Interactive.unsubscribe(it);
    }
    throw new java.util.NoSuchElementException();
}