public final java.util.Iterator<?> localEntriesIterator(java.util.Set bucketSet, final boolean primaryOnly, final boolean forUpdate, boolean includeValues, final com.gemstone.gemfire.internal.cache.TXState txState) {
    if (bucketSet != null) {
        return new com.gemstone.gemfire.internal.cache.PartitionedRegion.PRLocalScanIterator(bucketSet, txState, forUpdate, includeValues, true);
    }
    return new com.gemstone.gemfire.internal.cache.PartitionedRegion.PRLocalScanIterator(primaryOnly, txState, forUpdate, includeValues);
}