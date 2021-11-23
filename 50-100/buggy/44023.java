public java.util.List<com.example.mayc.openmind.DocumentPayload> getDocuments(java.lang.String input) throws java.lang.Exception {
    com.example.mayc.openmind.DiscoveryQuery discoveryQuery = new com.example.mayc.openmind.DiscoveryQuery();
    com.ibm.watson.developer_cloud.discovery.v1.model.query.QueryResponse output = discoveryQuery.query(input);
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> results = output.getResults();
    java.lang.String jsonRes = new com.google.gson.Gson().toJson(results);
    com.google.gson.JsonElement jelement = new com.google.gson.JsonParser().parse(jsonRes);
    return createPayload(jelement);
}