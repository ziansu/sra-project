public java.lang.String uriToPath(java.lang.String uri) throws Services.FileRetrievementServiceException {
    try {
        java.lang.String cleaned_uri = uri.replace("_S_", "/");
        java.net.URL url = new java.net.URL(cleaned_uri);
        return url.getPath().substring(1);
    } catch (java.net.MalformedURLException mue) {
        java.lang.String message = (("The following url is malformed: " + uri) + " and cause the following error ") + (mue.getCause());
        throw new Services.FileRetrievementServiceException(mue, "uriToPath", message, uri);
    }
}