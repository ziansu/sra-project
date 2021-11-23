private org.springframework.http.HttpHeaders createHeaders(final java.lang.String userInfo) {
    byte[] encodedAuth = org.apache.commons.codec.binary.Base64.encodeBase64(userInfo.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
    java.lang.String authHeader = "Basic " + (new java.lang.String(encodedAuth));
    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
    headers.set(HttpHeaders.AUTHORIZATION, authHeader);
    return headers;
}