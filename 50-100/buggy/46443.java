protected java.lang.String processReplacements(java.lang.String path) {
    path = path.replace("${apiPath}", server.getApiPath());
    path = path.replace("${uiPath}", server.getBasePath());
    return path.replace("${basePath}", server.getUiPath());
}