public org.apache.sling.api.SlingHttpServletResponse getResponse() {
    if ((response) == null) {
        response = getSling().getResponse();
    }
    return response;
}