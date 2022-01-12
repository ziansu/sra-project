public org.gradle.cache.internal.btree.BTreePersistentIndexedCache.DataBlockUpdateResult useNewValue(V value) throws java.lang.Exception {
    setValue(value);
    boolean ok = (buffer.totalBytesUnread()) <= (size);
    if (ok) {
        this.value = value;
        store.write(this);
        return org.gradle.cache.internal.btree.BTreePersistentIndexedCache.DataBlockUpdateResult.success();
    }else {
        return org.gradle.cache.internal.btree.BTreePersistentIndexedCache.DataBlockUpdateResult.failed(buffer);
    }
}