private java.nio.charset.Charset getCharset(org.springframework.http.client.ClientHttpResponse response) {
    org.springframework.http.HttpHeaders headers = response.getHeaders();
    org.springframework.http.MediaType contentType = headers.getContentType();
    return contentType != null ? contentType.getCharset() : null;
}