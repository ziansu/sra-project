@java.lang.Override
public T next() {
    if ((this.iterator) == null) {
        this.iterator = this.iterable.iterator();
    }
    if (!(this.iterator.hasNext())) {
        this.iterator = this.iterable.iterator();
        if (!(this.iterator.hasNext())) {
            throw new java.util.NoSuchElementException();
        }
    }
    return this.iterator.next();
}