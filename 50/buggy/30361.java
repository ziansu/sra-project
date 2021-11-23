@java.lang.Override
public T next() {
    T current = nextRecord;
    try {
        readNext();
    } catch (java.io.IOException e) {
        new java.lang.RuntimeException(e);
    }
    return current;
}