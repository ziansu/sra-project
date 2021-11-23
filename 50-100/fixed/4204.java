public K next() {
    if ((idx) == (mKeys.length)) {
        return null;
    }
    while (((mKeys[idx]) == null) || ((mKeys[idx]) == (REMOVED))) {
        ++(idx);
        if ((idx) == (mKeys.length)) {
            return null;
        }
    } 
    return mKeys[((idx)++)];
}