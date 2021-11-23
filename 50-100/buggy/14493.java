@java.lang.Override
public void remove() {
    if ((currentEntry) == null) {
        throw new java.lang.IllegalStateException();
    }
    removeEntry(currentEntry);
    if ((currentEntry) == (prevEntry)) {
        prevEntry = (hasNext()) ? nextEntry.previous : null;
        --(index);
    }else
        if ((currentEntry) == (nextEntry)) {
            nextEntry = (hasPrevious()) ? prevEntry.next : null;
        }
    
    --(size);
    version = modCount;
    currentEntry = null;
}