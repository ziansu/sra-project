@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/namespaces/{namespace-id}/metadata/search")
public void searchMetadata(org.jboss.netty.handler.codec.http.HttpRequest request, co.cask.http.HttpResponder responder, @javax.ws.rs.PathParam(value = "namespace-id")
java.lang.String namespaceId, @javax.ws.rs.QueryParam(value = "query")
java.lang.String searchQuery, @javax.ws.rs.QueryParam(value = "target")
java.lang.String target) throws java.lang.Exception {
    co.cask.cdap.proto.metadata.MetadataSearchTargetType metadataSearchTargetType;
    if (target != null) {
        metadataSearchTargetType = co.cask.cdap.proto.metadata.MetadataSearchTargetType.valueOf(target.toUpperCase());
    }else {
        metadataSearchTargetType = null;
    }
    java.util.Set<co.cask.cdap.proto.metadata.MetadataSearchResultRecord> results = metadataAdmin.searchMetadata(namespaceId, searchQuery, metadataSearchTargetType);
    responder.sendJson(HttpResponseStatus.OK, results, co.cask.cdap.metadata.MetadataHttpHandler.SET_METADATA_SEARCH_RESULT_TYPE, co.cask.cdap.metadata.MetadataHttpHandler.GSON);
}