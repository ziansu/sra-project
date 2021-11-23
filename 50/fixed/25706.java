@java.lang.Override
public boolean hasNext() {
    return (iterator.hasNext()) || (iterable.iterator().hasNext());
}