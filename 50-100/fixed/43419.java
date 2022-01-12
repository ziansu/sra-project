private void loadData(org.apache.hadoop.hbase.client.Admin admin, org.apache.hadoop.hbase.client.BufferedMutator table, org.apache.hadoop.hbase.TableName tableName, byte[] key, byte[] value) throws java.io.IOException {
    org.apache.hadoop.hbase.client.Put put = new org.apache.hadoop.hbase.client.Put(key);
    put.addColumn(org.apache.hadoop.hbase.util.Bytes.toBytes(org.apache.hadoop.hbase.mob.compactions.TestMobCompactor.family1), org.apache.hadoop.hbase.util.Bytes.toBytes(org.apache.hadoop.hbase.mob.compactions.TestMobCompactor.qf1), value);
    table.mutate(put);
    table.flush();
    admin.flush(tableName);
}