private static java.lang.String buildAbsolutePath(java.lang.String controllerPath, java.lang.String methodPath) {
    java.lang.String absolutePath = controllerPath;
    if (!(methodPath.isEmpty())) {
        absolutePath += "/" + methodPath;
    }
    return absolutePath;
}