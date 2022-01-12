@java.lang.Override
public T next() {
    T current = nextRecord;
    try {
        readNext();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    return current;
}