protected org.springframework.http.client.ClientHttpResponse getClientResponse(java.lang.String url, org.springframework.http.HttpMethod method, java.lang.String... headers) throws java.io.IOException, java.net.URISyntaxException {
    return getClientResponse(url, method, new org.springframework.http.client.HttpComponentsClientHttpRequestFactory() {
        @java.lang.Override
        protected org.apache.http.protocol.HttpContext createHttpContext(org.springframework.http.HttpMethod httpMethod, java.net.URI uri) {
            return org.springframework.boot.context.embedded.AbstractEmbeddedServletContainerFactoryTests.this.httpClientContext;
        }
    }, headers);
}