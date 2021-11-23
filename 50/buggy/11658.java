public boolean hasColumn(java.lang.String key) {
    checkNonNullObject(key);
    lock();
    try {
        return idMap.containsKey(key);
    } finally {
        unlock();
    }
}