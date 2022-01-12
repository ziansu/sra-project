private com.arangodb.http.HttpResponseEntity getCursor(java.lang.String database, java.lang.String query, java.util.Map<java.lang.String, java.lang.Object> bindVars, com.arangodb.util.AqlQueryOptions aqlQueryOptions) throws com.arangodb.ArangoException {
    java.util.Map<java.lang.String, java.lang.Object> map = aqlQueryOptions.toMap();
    map.put("query", query);
    map.put("bindVars", (bindVars == null ? java.util.Collections.emptyMap() : bindVars));
    com.arangodb.http.HttpResponseEntity res = httpManager.doPost(createEndpointUrl(database, "/_api/cursor"), null, com.arangodb.entity.EntityFactory.toJsonString(map));
    return res;
}