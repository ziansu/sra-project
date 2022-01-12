@java.lang.Override
public java.util.Collection<V> next() {
    if (!(this.hasNext())) {
        throw new java.util.NoSuchElementException();
    }
    java.util.Collection<V> resources = getPage(nextPage, itemsPerPage);
    if ((resources.size()) == 0) {
        nextPage = -1;
    }else {
        ++(nextPage);
    }
    return resources;
}