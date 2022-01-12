public void put(K key, V value) {
    int index = java.util.Collections.binarySearch(mKeys, key);
    if (index >= 0) {
        mValues.set(index, value);
    }else {
        mKeys.add((((-1) * index) - 1), key);
        mValues.add((((-1) * index) - 1), value);
    }
}