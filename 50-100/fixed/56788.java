public org.unfoldingword.resourcecontainer.ResourceContainer openResourceContainer(java.lang.String containerSlug) throws java.lang.Exception {
    java.io.File directory = new java.io.File(resourceDir, containerSlug);
    java.io.File archive = new java.io.File(((directory + ".") + (org.unfoldingword.resourcecontainer.ResourceContainer.fileExtension)));
    return org.unfoldingword.resourcecontainer.ResourceContainer.open(archive, directory);
}