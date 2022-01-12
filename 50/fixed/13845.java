public org.apache.sling.api.SlingHttpServletResponse getResponse() {
    if ((response) == null) {
        response = context.getResponse();
    }
    return response;
}