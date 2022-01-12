public void onRemoval(com.google.common.cache.RemovalNotification<java.lang.String, org.apache.storm.tuple.Tuple[]> removal) {
    if (!(removal.wasEvicted()))
        return ;
    
    com.digitalpebble.stormcrawler.elasticsearch.persistence.StatusUpdaterBolt.LOG.error("Purged from waitAck {} with {} values", removal.getKey(), removal.getValue().length);
    for (org.apache.storm.tuple.Tuple t : removal.getValue()) {
        com.digitalpebble.stormcrawler.elasticsearch.persistence.StatusUpdaterBolt.super._collector.fail(t);
    }
}