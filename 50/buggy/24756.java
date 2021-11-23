protected boolean internalRemove(java.lang.Object o) {
    int index = indexOf(o);
    boolean contained = index != (-1);
    if (contained) {
        remove(index);
    }
    return contained;
}