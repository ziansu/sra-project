public void onRemoval(com.google.common.cache.RemovalNotification<java.lang.String, java.util.List<org.apache.storm.tuple.Tuple>> removal) {
    if (!(removal.wasEvicted()))
        return ;
    
    com.digitalpebble.stormcrawler.elasticsearch.persistence.StatusUpdaterBolt.LOG.error("Purged from waitAck {} with {} values", removal.getKey(), removal.getValue().size());
    for (org.apache.storm.tuple.Tuple t : removal.getValue()) {
        _collector.fail(t);
    }
}