public java.lang.String pollUntilExpectedResponse(final java.lang.String url, final java.lang.String mediaType, final int delayInMillis, final javax.ws.rs.core.Response.Status status) {
    final javax.ws.rs.core.Response result = pollUntilExpectedResponse(url, mediaType, delayInMillis, ( response) -> (response.getStatus()) == (status.getStatusCode()));
    return result.readEntity(java.lang.String.class);
}