public org.jumpmind.symmetric.io.stage.IStagedResource find(java.lang.String path) {
    org.jumpmind.symmetric.io.stage.IStagedResource resource = inUse.get(path);
    if (resource == null) {
        boolean foundResourcePath = resourcePaths.contains(path);
        if ((!foundResourcePath) && (clusterEnabled)) {
            refreshResourceList();
            foundResourcePath = resourcePaths.contains(path);
        }
        if (foundResourcePath) {
            resource = new org.jumpmind.symmetric.io.stage.StagedResource(directory, path, this);
        }
    }
    return resource;
}