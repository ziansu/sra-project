private org.springframework.http.ResponseEntity<java.lang.String> makeRestCall(java.lang.String url, java.lang.String userId, java.lang.String password) {
    if ((!("".equals(userId))) && (!("".equals(password)))) {
        com.capitalone.dashboard.collector.DefaultJiraClient.LOG.info("Call with userid and password");
        return restOperations.exchange(url, HttpMethod.GET, new org.springframework.http.HttpEntity(createHeaders(userId, password)), java.lang.String.class);
    }else {
        return restOperations.exchange(url, HttpMethod.GET, null, java.lang.String.class);
    }
}