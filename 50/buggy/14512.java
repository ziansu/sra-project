static java.nio.ByteBuffer endOfColumn(byte[] columnName) {
    return com.palantir.atlasdb.keyvalue.cassandra.CassandraKeyValueServices.makeCompositeBuffer(com.palantir.atlasdb.keyvalue.api.RangeRequests.previousLexicographicName(columnName), (-1));
}