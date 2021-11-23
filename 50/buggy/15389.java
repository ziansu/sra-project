@java.lang.Override
protected int getIndex(java.lang.String uuid) {
    cursor = java.util.Arrays.binarySearch(sortedUuids, 0, currentSize, uuid);
    return cursor;
}