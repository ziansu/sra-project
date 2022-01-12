@java.lang.Override
public boolean hasNext() {
    while (wrappedIterator.hasNext()) {
        O next = wrappedIterator.next();
        if (next == null) {
            throw new java.lang.IllegalStateException("Unexpectedly received null from the wrapped ResultSet's iterator.next()");
        }
        if (!(materializedSet.add(next))) {
            continue;
        }
        nextObject = next;
        return true;
    } 
    nextObject = null;
    materializedSet.clear();
    return false;
}