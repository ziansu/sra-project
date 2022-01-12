private boolean isPermissionRequest(final java.lang.String path, final java.lang.String httpMethod) {
    return (JaxrsResource.SECURITY_PATH.startsWith(path)) && ("GET".equals(httpMethod));
}