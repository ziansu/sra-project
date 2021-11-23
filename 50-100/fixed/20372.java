java.lang.String buildUriVerion(java.lang.String projectname) throws java.net.URISyntaxException {
    java.lang.String url = ((((((settings.getJiraBaseUrl()) + "/") + (settings.getApi())) + "/project/") + (projectname.replaceAll(" ", "%20"))) + "/versions") + "?maxResults=50&startAt=0";
    return url;
}