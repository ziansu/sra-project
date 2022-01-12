public boolean hasNext() {
    if ((idx) == (mKeys.length)) {
        return false;
    }
    while (((mKeys[idx]) == null) || ((mKeys[idx]) == (REMOVED))) {
        ++(idx);
        if ((idx) == (mKeys.length)) {
            return false;
        }
    } 
    return true;
}