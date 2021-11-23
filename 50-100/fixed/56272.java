@java.lang.Override
public java.lang.Void call() throws org.rocksdb.RocksDBException {
    try (final org.rocksdb.WriteBatch wb = new org.rocksdb.WriteBatch();final org.rocksdb.WriteOptions w_opt = new org.rocksdb.WriteOptions()) {
        for (int i = offset; i < (offset + 100); i++) {
            wb.put(java.nio.ByteBuffer.allocate(4).putInt(i).array(), "parallel rocks test".getBytes());
        }
        db.write(w_opt, wb);
    }
    return null;
}