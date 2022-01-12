private void assertCORSHeader(org.springframework.http.HttpHeaders headers) {
    java.util.Map<java.lang.String, java.lang.String> headerMap = headers.toSingleValueMap();
    org.hamcrest.MatcherAssert.assertThat(headerMap, hasKey("Access-Control-Allow-Headers"));
    org.hamcrest.MatcherAssert.assertThat(headerMap, hasKey("Access-Control-Allow-Methods"));
    org.hamcrest.MatcherAssert.assertThat(headerMap, hasKey("Access-Control-Max-Age"));
}