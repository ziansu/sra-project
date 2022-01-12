public boolean hasNext() {
    if ((idx) == (tabSize)) {
        return false;
    }
    while (((mKeys[idx]) == null) || ((mKeys[idx]) == (REMOVED))) {
        ++(idx);
        if ((idx) == (tabSize)) {
            return false;
        }
    } 
    return true;
}