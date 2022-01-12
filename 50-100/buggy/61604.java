@java.lang.Override
public org.apache.cassandra.io.util.ReaderCache.Buffer rebuffer(long position) {
    try {
        long pageAlignedPos = position & (alignmentMask);
        return cache.get(new org.apache.cassandra.io.util.ReaderCache.Key(source, pageAlignedPos)).reference();
    } catch (java.lang.Throwable t) {
        com.google.common.base.Throwables.propagateIfInstanceOf(t.getCause(), org.apache.cassandra.io.sstable.CorruptSSTableException.class);
        throw com.google.common.base.Throwables.propagate(t);
    }
}