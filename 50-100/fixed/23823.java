public java.io.InputStream downloadOrdersAsStream(java.lang.String startTime, java.lang.String endTime, java.lang.String tenantIDs, java.lang.String orderIDs, java.lang.String status) {
    java.net.URI uri = getDownloadOrdersURI(startTime, endTime, tenantIDs, orderIDs, status);
    com.sun.jersey.api.client.ClientResponse response = client.resource(uri).accept(MediaType.APPLICATION_XML).get(com.sun.jersey.api.client.ClientResponse.class);
    return response.getEntityInputStream();
}