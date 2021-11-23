static java.nio.ByteBuffer endOfColumn(byte[] columnName) {
    return com.palantir.atlasdb.keyvalue.cassandra.CassandraKeyValueServices.makeCompositeBuffer(columnName, (-1));
}