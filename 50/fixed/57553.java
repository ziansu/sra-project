private void reindexChildren(int start) {
    for (int i = start; i < (childNodes.size()); i++) {
        childNodes.get(i).setSiblingIndex(i);
    }
}