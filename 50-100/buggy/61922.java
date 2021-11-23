protected org.apache.cassandra.db.UnfilteredPartitionIterator withoutPurgeableTombstones(org.apache.cassandra.db.UnfilteredPartitionIterator iterator, org.apache.cassandra.db.ColumnFamilyStore cfs) {
    final boolean isForThrift = iterator.isForThrift();
    class WithoutPurgeableTombstones extends org.apache.cassandra.db.PurgeFunction {
        public WithoutPurgeableTombstones() {
            super(isForThrift, cfs.gcBefore(nowInSec()), oldestUnrepairedTombstone(), cfs.getCompactionStrategyManager().onlyPurgeRepairedTombstones());
        }

        protected long getMaxPurgeableTimestamp() {
            return java.lang.Long.MAX_VALUE;
        }
    }
    return org.apache.cassandra.db.transform.Transformation.apply(iterator, new WithoutPurgeableTombstones());
}