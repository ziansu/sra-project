@java.lang.Override
public org.ednovo.gooru.server.request.JsonResponseRepresentation run() throws java.lang.Exception {
    setClientResource(new org.restlet.resource.ClientResource(url));
    setMediaType(type);
    setEncodings(Encoding.GZIP);
    setRepresentation(getClientResource().get());
    org.restlet.representation.Representation decodedRep = new org.restlet.engine.application.DecodeRepresentation(getClientResource().get());
    org.ednovo.gooru.server.request.JsonResponseRepresentation jsonResponseRepresentation = new org.ednovo.gooru.server.request.JsonResponseRepresentation();
    jsonResponseRepresentation.setJsonRepresentation(new org.restlet.ext.json.JsonRepresentation(decodedRep.getText()));
    return jsonResponseRepresentation;
}