private void setCsrfToken(javax.ws.rs.client.Invocation.Builder request) {
    java.lang.String csrfToken = com.kiuwan.client.KiuwanRestApiClient.csrfToken;
    if (csrfToken != null) {
        request.header(com.kiuwan.client.KiuwanRestApiClient.CSRF_TOKEN_HEADER, csrfToken);
    }
}