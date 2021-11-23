@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/{stream}/properties")
@co.cask.cdap.common.security.AuditPolicy(value = co.cask.cdap.common.security.AuditDetail.REQUEST_BODY)
public void setConfig(org.jboss.netty.handler.codec.http.HttpRequest request, co.cask.http.HttpResponder responder, @javax.ws.rs.PathParam(value = "namespace-id")
java.lang.String namespaceId, @javax.ws.rs.PathParam(value = "stream")
java.lang.String stream) throws java.lang.Exception {
    co.cask.cdap.proto.id.StreamId streamId = validateAndGetStreamId(namespaceId, stream);
    checkStreamExists(streamId);
    co.cask.cdap.proto.StreamProperties properties = getAndValidateConfig(request);
    streamAdmin.updateConfig(streamId, properties);
    responder.sendStatus(HttpResponseStatus.OK);
}