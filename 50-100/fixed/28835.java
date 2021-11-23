public org.gephi.graph.api.Column getColumn(final java.lang.String key) {
    checkNonNullObject(key);
    lock();
    try {
        short id = idMap.getShort(key.toLowerCase());
        if (id == (org.gephi.graph.impl.ColumnStore.NULL_SHORT)) {
            return null;
        }
        return columns[shortToInt(id)];
    } finally {
        unlock();
    }
}