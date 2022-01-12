@java.lang.Override
public boolean compacted(final java.util.concurrent.Callable<java.lang.Boolean> setHead) throws java.lang.Exception {
    final com.google.common.base.Stopwatch w = com.google.common.base.Stopwatch.createUnstarted();
    java.util.concurrent.Callable<java.lang.Boolean> c = new java.util.concurrent.Callable<java.lang.Boolean>() {
        @java.lang.Override
        public java.lang.Boolean call() throws java.lang.Exception {
            org.apache.jackrabbit.oak.plugins.segment.SegmentNodeStoreBuilder.LOG.info("Waited {} microseconds for compaction lock", w.elapsed(java.util.concurrent.TimeUnit.MICROSECONDS));
            return setHead.call();
        }
    };
    w.start();
    return segmentStore.locked(true, c, lockWaitTime, java.util.concurrent.TimeUnit.SECONDS);
}