public K next() {
    if ((idx) == (tabSize)) {
        return null;
    }
    while (((mKeys[idx]) == null) || ((mKeys[idx]) == (REMOVED))) {
        ++(idx);
        if ((idx) == (tabSize)) {
            return null;
        }
    } 
    return mKeys[((idx)++)];
}