public void clear(final int index) {
    if (locked)
        throw new java.lang.IllegalAccessError("AreaSet is locked");
    
    int pos;
    if ((list.size()) < (uk.me.parabola.splitter.AreaSet.BIN_SEARCH_LIMIT)) {
        list.rem(index);
    }else {
        pos = java.util.Arrays.binarySearch(list.elements(), 0, list.size(), index);
        if (pos >= 0) {
            list.removeInt(pos);
        }
    }
}