public static com.fasterxml.jackson.databind.JsonNode getStats(org.apache.beam.sdk.io.elasticsearch.ElasticsearchIO.ConnectionConfiguration connectionConfiguration, boolean shardLevel) throws java.io.IOException {
    java.util.HashMap<java.lang.String, java.lang.String> params = new java.util.HashMap<>();
    if (shardLevel) {
        params.put("level", "shards");
    }
    java.lang.String endpoint = java.lang.String.format("/%s/_stats", connectionConfiguration.getIndex());
    try (org.elasticsearch.client.RestClient restClient = connectionConfiguration.createClient()) {
        return org.apache.beam.sdk.io.elasticsearch.ElasticsearchIO.parseResponse(restClient.performRequest("GET", endpoint, params));
    }
}