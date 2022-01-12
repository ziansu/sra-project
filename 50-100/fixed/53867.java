private final boolean addHitToBuffer(org.elasticsearch.search.SearchHit hit) {
    java.util.Map<java.lang.String, java.lang.Object> keyValues = hit.sourceAsMap();
    java.lang.String url = ((java.lang.String) (keyValues.get("url")));
    if (beingProcessed.containsKey(url)) {
        return false;
    }
    com.digitalpebble.stormcrawler.Metadata metadata = fromKeyValues(keyValues);
    return buffer.add(new org.apache.storm.tuple.Values(url, metadata));
}