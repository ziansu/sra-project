public Item next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException();
    }
    synchronized(a) {
        if ((a[randIx[i]]) == null) {
            throw new java.util.ConcurrentModificationException(("Underlying " + "implementation has been modified"));
        }
        return a[randIx[((i)++)]];
    }
}