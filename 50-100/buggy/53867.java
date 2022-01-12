private final void addHitToBuffer(org.elasticsearch.search.SearchHit hit) {
    java.util.Map<java.lang.String, java.lang.Object> keyValues = hit.sourceAsMap();
    java.lang.String url = ((java.lang.String) (keyValues.get("url")));
    if (beingProcessed.containsKey(url)) {
        return ;
    }
    com.digitalpebble.stormcrawler.Metadata metadata = fromKeyValues(keyValues);
    buffer.add(new org.apache.storm.tuple.Values(url, metadata));
}