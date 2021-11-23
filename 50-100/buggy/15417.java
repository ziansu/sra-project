@java.lang.Override
protected int getIndex(java.lang.String uuid) {
    for (int i = 0; i < (currentSize); i++) {
        if (array[i].getUuid().equals(uuid)) {
            cursor = i;
            return cursor;
        }
    }
    return -1;
}