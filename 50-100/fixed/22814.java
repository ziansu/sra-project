public int put(K key, V value) {
    int index = java.util.Collections.binarySearch(mKeys, key);
    if (index >= 0) {
        mValues.set(index, value);
        return 0;
    }else {
        mKeys.add((((-1) * index) - 1), key);
        mValues.add((((-1) * index) - 1), value);
        return 1;
    }
}