public java.lang.String getGlobalID(java.lang.String key) throws java.io.IOException {
    org.apache.hadoop.hbase.client.Get globalKeyGet = new org.apache.hadoop.hbase.client.Get(org.apache.hadoop.hbase.util.Bytes.toBytes(key));
    if (globalKeyGet == null) {
        return null;
    }
    org.apache.hadoop.hbase.client.Result keyResult = hTableIndex.get(globalKeyGet);
    if (keyResult.isEmpty()) {
        return null;
    }
    return org.apache.hadoop.hbase.util.Bytes.toString(keyResult.getValue(org.apache.hadoop.hbase.util.Bytes.toBytes("global_id"), org.apache.hadoop.hbase.util.Bytes.toBytes("value")));
}