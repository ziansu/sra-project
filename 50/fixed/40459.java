@java.lang.Override
public final com.yahoo.ycsb.Status update(java.lang.String table, java.lang.String key, java.util.HashMap<java.lang.String, com.yahoo.ycsb.ByteIterator> values) {
    return generalUpdate(ch.ethz.tell.TellStore.UPDATE, table, key, values);
}