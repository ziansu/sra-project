@java.lang.Override
public final E next() {
    if (!(found)) {
        throw new java.util.NoSuchElementException(("Either iterator is empty, or iterator state has not " + "been updated"));
    }
    if ((foundItem) == null) {
        throw new java.lang.IllegalStateException(("Potential out of sync error in " + (getClass().getSimpleName())));
    }
    found = false;
    return foundItem;
}