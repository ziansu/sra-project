@java.lang.Override
public boolean hasNext() {
    if (((this.iterator) == null) || (!(this.iterator.hasNext()))) {
        this.iterator = this.iterable.iterator();
    }
    return this.iterator.hasNext();
}