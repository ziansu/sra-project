protected com.arangodb.velocystream.Request deleteEdgeRequest(final java.lang.String key, final com.arangodb.model.EdgeDeleteOptions options) {
    final com.arangodb.velocystream.Request request = new com.arangodb.velocystream.Request(db, com.arangodb.velocystream.RequestType.DELETE, executor.createPath(ArangoDBConstants.PATH_API_GHARIAL, graph, ArangoDBConstants.EDGE, createDocumentHandle(key)));
    final com.arangodb.model.EdgeDeleteOptions params = (options != null) ? options : new com.arangodb.model.EdgeDeleteOptions();
    request.putQueryParam(ArangoDBConstants.WAIT_FOR_SYNC, params.getWaitForSync());
    request.putHeaderParam(ArangoDBConstants.IF_MATCH, params.getIfMatch());
    return request;
}