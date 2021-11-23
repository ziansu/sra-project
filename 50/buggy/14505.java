public void setOnIndex(java.lang.String index, java.lang.String type, java.lang.String id, java.util.Map source) {
    org.elasticsearch.action.index.IndexResponse response = _client.prepareIndex(index, type, id).setSource(source).get();
}