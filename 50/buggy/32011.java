public boolean keyMayExist(final org.rocksdb.ReadOptions readOptions, final byte[] key, final java.lang.StringBuffer value) {
    return keyMayExist(nativeHandle_, readOptions.nativeHandle_, key, 0, key.length, value);
}