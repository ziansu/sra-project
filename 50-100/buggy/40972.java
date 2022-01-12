@java.lang.Override
public T next() {
    if (isClosed()) {
        throw new org.apache.ibatis.cursor.CursorException("Cursor is closed");
    }
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