@java.lang.Override
public int update(java.lang.String bucket, java.lang.String key, java.util.HashMap<java.lang.String, com.yahoo.ycsb.ByteIterator> values) {
    return writeToStorage(bucket, key, values, false);
}