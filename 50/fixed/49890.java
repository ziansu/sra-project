@java.lang.Override
protected void beforeTestsStarted() throws java.lang.Exception {
    super.beforeTestsStarted();
    org.apache.ignite.internal.processors.cache.distributed.near.GridCachePartitionedBasicStoreMultiNodeSelfTest.stores = java.util.Collections.synchronizedList(new java.util.ArrayList<org.apache.ignite.internal.processors.cache.GridCacheTestStore>());
    startGridsMultiThreaded(org.apache.ignite.internal.processors.cache.distributed.near.GridCachePartitionedBasicStoreMultiNodeSelfTest.GRID_CNT);
}