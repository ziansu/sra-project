public void remove(java.lang.String gKey) {
    int index = getIndex(gKey);
    if (index != (-1)) {
        pairs.remove(index);
    }
}