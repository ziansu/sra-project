@java.lang.Override
public org.apache.cassandra.io.util.ReaderCache.Buffer rebuffer(long position) {
    try {
        long pageAlignedPos = position & (alignmentMask);
        org.apache.cassandra.io.util.ReaderCache.Buffer buf;
        do
            buf = cache.get(new org.apache.cassandra.io.util.ReaderCache.Key(source, pageAlignedPos)).reference();
        while (buf == null );
        return buf;
    } catch (java.lang.Throwable t) {
        com.google.common.base.Throwables.propagateIfInstanceOf(t.getCause(), org.apache.cassandra.io.sstable.CorruptSSTableException.class);
        throw com.google.common.base.Throwables.propagate(t);
    }
}