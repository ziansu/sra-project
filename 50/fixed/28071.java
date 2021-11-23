@java.lang.Override
public void put(org.rocksdb.ColumnFamilyHandle columnFamilyHandle, byte[] key, byte[] value) {
    put(nativeHandle_, key, key.length, value, value.length, columnFamilyHandle.nativeHandle_);
}