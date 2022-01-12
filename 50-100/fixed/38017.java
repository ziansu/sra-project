public int getIndex(java.lang.String gKey) {
    int ind = -1;
    for (int i = 0; (!(pairs.get(i).key.equals(gKey))) && (i < ((pairs.size()) - 1)); i++) {
        ind = i + 1;
    }
    return ind;
}