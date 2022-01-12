protected com.arangodb.velocystream.Request getEdgeRequest(final java.lang.String key, final com.arangodb.model.DocumentReadOptions options) {
    final com.arangodb.velocystream.Request request = new com.arangodb.velocystream.Request(db, com.arangodb.velocystream.RequestType.GET, executor.createPath(ArangoDBConstants.PATH_API_GHARIAL, graph, ArangoDBConstants.EDGE, createDocumentHandle(key)));
    final com.arangodb.model.DocumentReadOptions params = (options != null) ? options : new com.arangodb.model.DocumentReadOptions();
    request.putHeaderParam(ArangoDBConstants.IF_NONE_MATCH, params.getIfNoneMatch());
    request.putHeaderParam(ArangoDBConstants.IF_MATCH, params.getIfMatch());
    return request;
}