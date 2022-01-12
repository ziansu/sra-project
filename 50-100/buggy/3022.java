@java.lang.Override
public org.apache.cassandra.io.util.ReaderCache.Buffer load(org.apache.cassandra.io.util.ReaderCache.Key key) throws java.lang.Exception {
    org.apache.cassandra.io.util.BufferlessRebufferer rebufferer = key.file.cacheRebufferer();
    synchronized(rebufferer) {
        java.nio.ByteBuffer buffer = rebufferer.rebuffer(key.position, org.apache.cassandra.utils.memory.BufferPool.get(key.file.chunkSize()));
        assert buffer != null;
        return new org.apache.cassandra.io.util.ReaderCache.Buffer(buffer, key.position).reference();
    }
}