private java.lang.String computeMethodForRedirect(java.lang.String initialMethod, java.lang.String responseCode) {
    if (!(HTTPConstants.HEAD.equalsIgnoreCase(initialMethod))) {
        return org.apache.jmeter.protocol.http.util.HTTPConstants.GET;
    }
    return initialMethod;
}