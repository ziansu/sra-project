protected java.lang.String processReplacements(java.lang.String path) {
    path = path.replace("${apiPath}", server.getApiPath());
    path = path.replace("${uiPath}", server.getUiPath());
    return path.replace("${basePath}", server.getBasePath());
}