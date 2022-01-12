public java.io.InputStream getAsText(java.util.Collection<java.lang.String> nodeIds, java.util.Collection<java.lang.String> logNames, java.lang.Integer severity, java.lang.String start, java.lang.String end, java.lang.String regex, java.lang.Integer maxCount) {
    java.net.URI uri = getURI(nodeIds, null, logNames, severity, start, end, regex, maxCount);
    com.sun.jersey.api.client.ClientResponse response = client.getClient().resource(uri).accept(MediaType.TEXT_PLAIN).get(com.sun.jersey.api.client.ClientResponse.class);
    return response.getEntityInputStream();
}