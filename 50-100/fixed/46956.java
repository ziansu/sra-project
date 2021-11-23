public int getColumnIndex(final java.lang.String key) {
    checkNonNullObject(key);
    lock();
    try {
        short id = idMap.getShort(key.toLowerCase());
        if (id == (org.gephi.graph.impl.ColumnStore.NULL_SHORT)) {
            throw new java.lang.IllegalArgumentException("The column doesnt exist");
        }
        return shortToInt(id);
    } finally {
        unlock();
    }
}