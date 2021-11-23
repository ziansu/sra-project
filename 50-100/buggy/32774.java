@java.lang.Override
protected com.akamai.testing.edgegrid.core.Request map(io.restassured.specification.FilterableRequestSpecification requestSpec) {
    return com.akamai.testing.edgegrid.core.Request.builder().method(requestSpec.getMethod()).uriWithQuery(java.net.URI.create(requestSpec.getURI())).headers(com.akamai.testing.edgegrid.restassured.RestAssuredSigner.getHeaders(requestSpec.getHeaders())).body(requestSpec.getBody()).build();
}