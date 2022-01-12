private static <T extends java.lang.Comparable<T>> boolean testIterator(java.util.Iterator<T> iter) {
    while (iter.hasNext()) {
        T item = iter.next();
        if (item == null) {
            java.lang.System.err.println("Iterator failure.");
            return false;
        }
    } 
    return true;
}