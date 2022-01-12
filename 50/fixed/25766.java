@org.apache.nifi.annotation.lifecycle.OnRemoved
public void onRemoved(final org.apache.nifi.processor.ProcessContext context) {
    final org.apache.nifi.distributed.cache.client.DistributedMapCacheClient client = context.getProperty(org.apache.nifi.hbase.GetHBase.DISTRIBUTED_CACHE_SERVICE).asControllerService(org.apache.nifi.distributed.cache.client.DistributedMapCacheClient.class);
    if (client != null) {
        clearState(client);
    }
}