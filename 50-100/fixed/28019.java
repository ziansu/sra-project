@java.lang.Override
public void insertColumn(java.lang.String columnFamily, java.lang.String rowKey, org.apache.cassandra.thrift.Column column) throws java.io.UnsupportedEncodingException, org.apache.cassandra.thrift.InvalidRequestException, org.apache.cassandra.thrift.TimedOutException, org.apache.cassandra.thrift.UnavailableException, org.apache.thrift.TException {
    org.apache.cassandra.thrift.ColumnParent parent = new org.apache.cassandra.thrift.ColumnParent(columnFamily);
    facebook.bot.cassandra.CassandraImpl.getClientConect().insert(java.nio.ByteBuffer.wrap(rowKey.getBytes()), parent, column, facebook.bot.cassandra.Constants.CL_1);
    getClientClose();
}