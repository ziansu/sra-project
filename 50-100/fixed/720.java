public java.lang.String pollUntilExpectedResponse(final java.lang.String url, final java.lang.String mediaType, final int delayInMillis, final javax.ws.rs.core.Response.Status status) {
    return pollUntilExpectedResponse(url, mediaType, delayInMillis, ( response) -> (response.getStatus()) == (status.getStatusCode()), ( value) -> true);
}