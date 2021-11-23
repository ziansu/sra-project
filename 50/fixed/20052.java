private static com.jcabi.http.Request getRequest(final java.lang.String uri) {
    return new com.jcabi.http.request.ApacheRequest(uri).header(HttpHeaders.USER_AGENT, com.jcabi.github.RtGithub.USER_AGENT).header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON).header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
}