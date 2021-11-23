private org.rocksdb.RocksIterator getPositionedIterator(java.lang.String offset) {
    org.rocksdb.RocksIterator iterator = queueStore.iter(this);
    if (com.google.common.base.Strings.isNullOrEmpty(offset)) {
        iterator.seekToFirst();
    }else {
        iterator.seek(offset.getBytes());
        iterator.next();
    }
    return iterator;
}