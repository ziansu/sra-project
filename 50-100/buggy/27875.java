@java.lang.Override
public long size(@org.jetbrains.annotations.Nullable
java.lang.String spaceName, org.apache.ignite.internal.processors.query.GridQueryTypeDescriptor type, org.apache.ignite.spi.indexing.IndexingQueryFilter filters) throws org.apache.ignite.IgniteCheckedException {
    org.apache.ignite.internal.processors.query.h2.IgniteH2Indexing.TableDescriptor tbl = tableDescriptor(spaceName, type);
    if (tbl == null)
        return -1;
    
    org.apache.ignite.spi.IgniteSpiCloseableIterator<java.util.List<?>> iter = queryFields(spaceName, ("SELECT COUNT(*) FROM " + (tbl.fullTableName())), null, null, 0, null).iterator();
    return ((java.lang.Number) (iter.next().get(0))).longValue();
}