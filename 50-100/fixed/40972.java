@java.lang.Override
public T next() {
    T next = object;
    if (next == null) {
        next = fetchNextUsingRowBound();
    }
    if (next != null) {
        object = null;
        (iteratorIndex)++;
        return next;
    }
    throw new java.util.NoSuchElementException();
}