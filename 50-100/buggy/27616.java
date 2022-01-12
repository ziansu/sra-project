@java.lang.Override
public void onUpdated(java.lang.Iterable iterable) throws javax.cache.event.CacheEntryListenerException {
    for (java.lang.Object o : iterable) {
        if (o instanceof org.apache.ignite.cache.query.CacheQueryEntryEvent) {
            org.apache.ignite.cache.query.CacheQueryEntryEvent e = ((org.apache.ignite.cache.query.CacheQueryEntryEvent) (o));
            org.apache.ignite.internal.binary.BinaryObjectImpl val = ((org.apache.ignite.internal.binary.BinaryObjectImpl) (e.getValue()));
            java.lang.Integer seqNum = val.field(org.apache.ignite.internal.processors.cache.binary.BinaryMetadataUpdatesFlowTest.SEQ_NUM_FLD);
            observedIds.add(seqNum);
            if ((observedIds.size()) == (org.apache.ignite.internal.processors.cache.binary.BinaryMetadataUpdatesFlowTest.UPDATES_COUNT))
                org.apache.ignite.internal.processors.cache.binary.BinaryMetadataUpdatesFlowTest.FINISH_LATCH.countDown();
            
        }
    }
}