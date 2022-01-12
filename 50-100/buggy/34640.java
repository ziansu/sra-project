public final java.util.Iterator<?> localEntriesIterator(final com.gemstone.gemfire.internal.cache.execute.InternalRegionFunctionContext context, final boolean primaryOnly, final boolean forUpdate, boolean includeValues, final com.gemstone.gemfire.internal.cache.TXState txState) {
    final java.util.Set<java.lang.Integer> bucketSet;
    if ((context != null) && ((bucketSet = context.getLocalBucketSet(this)) != null)) {
        return new com.gemstone.gemfire.internal.cache.PartitionedRegion.PRLocalScanIterator(bucketSet, txState, forUpdate, includeValues, false);
    }
    return new com.gemstone.gemfire.internal.cache.PartitionedRegion.PRLocalScanIterator(primaryOnly, txState, forUpdate, includeValues);
}