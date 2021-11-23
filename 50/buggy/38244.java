@java.lang.Override
public T next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException("No more elements.");
    }
    ++(consumed);
    return iterator.next();
}