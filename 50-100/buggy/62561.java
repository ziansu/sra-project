private java.lang.String doRestQuery(java.lang.String url, java.lang.String queryString) {
    java.lang.String uri = java.lang.String.format(org.jimsey.projects.turbine.inlet.web.FinanceControllerIT.realtimeUrl, queryString);
    org.jimsey.projects.turbine.inlet.web.FinanceControllerIT.logger.info(java.lang.String.format("when %s is called", uri));
    org.springframework.http.ResponseEntity<java.lang.String> response = rest.getForEntity(uri, java.lang.String.class);
    java.lang.String body = response.getBody();
    org.jimsey.projects.turbine.inlet.web.FinanceControllerIT.logger.info("then the response body should not be null [body:{}]", response.getBody());
    assertThat(body).isNotNull();
    assertThat(body).isNotEmpty();
    return body;
}