private void init(com.jaspersoft.jasperserver.jaxrs.client.core.SessionStorage sessionStorage) {
    com.jaspersoft.jasperserver.jaxrs.client.core.RestClientConfiguration configuration = sessionStorage.getConfiguration();
    contentType = ((configuration.getContentMimeType()) == (com.jaspersoft.jasperserver.jaxrs.client.core.enums.MimeType.JSON)) ? javax.ws.rs.core.MediaType.APPLICATION_JSON : javax.ws.rs.core.MediaType.APPLICATION_XML;
    acceptType = ((configuration.getAcceptMimeType()) == (com.jaspersoft.jasperserver.jaxrs.client.core.enums.MimeType.JSON)) ? javax.ws.rs.core.MediaType.APPLICATION_JSON : javax.ws.rs.core.MediaType.APPLICATION_XML;
    headers = new javax.ws.rs.core.MultivaluedHashMap<java.lang.String, java.lang.String>();
    usersWebTarget = sessionStorage.getRootTarget().path("/rest_v2").register(com.jaspersoft.jasperserver.jaxrs.client.providers.CustomRepresentationTypeProvider.class).register(org.glassfish.jersey.media.multipart.internal.MultiPartWriter.class);
}