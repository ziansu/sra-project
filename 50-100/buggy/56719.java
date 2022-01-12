protected java.lang.String getPath(java.lang.String aFilename) {
    java.lang.String result = null;
    try {
        java.net.URL resource = getClass().getResource(aFilename);
        if (resource == null) {
            throw new java.lang.RuntimeException(java.lang.String.format(("Resource '%s' can NOT be found " + "(does not exist or just not visible for current classloader)"), aFilename));
        }else {
            result = new java.io.File(resource.getPath()).getCanonicalPath();
        }
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(("Error while getting path for resource: " + aFilename), e);
    }
    return result;
}