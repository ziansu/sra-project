protected boolean internalRemove(java.lang.Object o) {
    int index = indexOf(o);
    boolean contained = index != (-1);
    if (contained) {
        internalRemove(index);
    }
    return contained;
}