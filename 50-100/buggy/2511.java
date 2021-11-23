protected com.arangodb.velocystream.Request documentExistsRequest(final java.lang.String key, final com.arangodb.model.DocumentExistsOptions options) {
    final com.arangodb.velocystream.Request request;
    request = new com.arangodb.velocystream.Request(db, com.arangodb.velocystream.RequestType.HEAD, executor.createPath(ArangoDBConstants.PATH_API_DOCUMENT, createDocumentHandle(key)));
    final com.arangodb.model.DocumentExistsOptions params = (options != null) ? options : new com.arangodb.model.DocumentExistsOptions();
    request.putHeaderParam(ArangoDBConstants.IF_MATCH, params.getIfMatch());
    request.putHeaderParam(ArangoDBConstants.IF_NONE_MATCH, params.getIfNoneMatch());
    return request;
}