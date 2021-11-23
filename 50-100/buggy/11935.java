@java.lang.Override
public com.sun.jersey.api.client.ClientResponse get(java.net.URI uri) throws com.emc.storageos.svcs.errorhandling.resources.InternalException {
    java.net.URI requestURI = _base.resolve(uri);
    com.sun.jersey.api.client.ClientResponse response = setResourceHeaders(_client.resource(requestURI)).type(MediaType.APPLICATION_JSON).get(com.sun.jersey.api.client.ClientResponse.class);
    if (authenticationFailed(response)) {
        closeResponse(response);
        authenticate();
        response = setResourceHeaders(_client.resource(requestURI)).type(MediaType.APPLICATION_JSON).get(com.sun.jersey.api.client.ClientResponse.class);
    }
    checkResponse(uri, response);
    return response;
}