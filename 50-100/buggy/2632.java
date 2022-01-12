public org.jenkinsci.plugins.gitlablogo.api.Project getProject(java.lang.String repositoryName) {
    java.lang.String url = null;
    try {
        url = ((endpointUrl) + "/projects/") + (urlEncode(repositoryName));
        java.lang.String json = getContent(url);
        org.codehaus.jackson.map.ObjectMapper mapper = new org.codehaus.jackson.map.ObjectMapper();
        return mapper.readValue(json, org.jenkinsci.plugins.gitlablogo.api.Project.class);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}