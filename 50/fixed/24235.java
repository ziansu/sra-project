@com.google.common.annotations.VisibleForTesting
public static org.apache.cassandra.schema.CompressionParams lz4(int chunkLength) {
    return org.apache.cassandra.schema.CompressionParams.lz4(chunkLength, chunkLength);
}