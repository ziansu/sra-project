private java.lang.String computeMethodForRedirect(java.lang.String initialMethod) {
    if (!(HTTPConstants.HEAD.equalsIgnoreCase(initialMethod))) {
        return org.apache.jmeter.protocol.http.util.HTTPConstants.GET;
    }
    return initialMethod;
}