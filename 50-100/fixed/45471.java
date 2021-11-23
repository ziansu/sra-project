public java.io.File closeResourceContainer(java.lang.String sourceLanguageSlug, java.lang.String projectSlug, java.lang.String resourceSlug) throws java.lang.Exception {
    org.unfoldingword.resourcecontainer.Resource resource = library.getResource(sourceLanguageSlug, projectSlug, resourceSlug);
    if (resource == null) {
        throw new java.lang.Exception("Unknown Resource");
    }
    java.lang.String containerSlug = org.unfoldingword.resourcecontainer.ContainerTools.makeSlug(sourceLanguageSlug, projectSlug, resourceSlug);
    java.io.File directory = new java.io.File(resourceDir, containerSlug);
    return org.unfoldingword.resourcecontainer.ResourceContainer.close(directory);
}