public static java.util.Set<java.lang.String> getExpectations(javax.ws.rs.core.HttpHeaders headers) {
    java.util.Set<java.lang.String> expectations = new java.util.HashSet<>();
    for (java.lang.String header : org.ovirt.engine.api.restapi.util.ExpectationHelper.HEADERS) {
        java.util.List<java.lang.String> values = headers.getRequestHeader(header);
        if (values != null) {
            expectations.addAll(values);
        }
    }
    return expectations;
}