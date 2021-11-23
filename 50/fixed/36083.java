@java.lang.Override
public void remove(org.rocksdb.ColumnFamilyHandle columnFamilyHandle, byte[] key) {
    remove(nativeHandle_, key, key.length, columnFamilyHandle.nativeHandle_);
}