@java.lang.Override
public T next() {
    if (!(this.hasNext())) {
        throw new java.util.NoSuchElementException("No more elements.");
    }
    ++(this.consumed);
    return this.iterator.next();
}