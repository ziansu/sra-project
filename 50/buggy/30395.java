@java.lang.Override
public void beforeRun() throws java.lang.Exception {
    com.hazelcast.cache.impl.ICacheService service = getService();
    cache = service.getRecordStore(name, getPartitionId());
}