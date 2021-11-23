private java.net.URI getResourceURI2(java.lang.String resourceName) throws java.io.IOException {
    java.lang.String mappedResourceName = mapResourceNameIfRequested(resourceName, this.getConfig());
    java.net.URI resourceURI = java.net.URI.create(mappedResourceName);
    java.net.URI uri;
    if (resourceURI.isAbsolute()) {
        uri = resourceURI;
    }else {
        java.net.URI localArchiveURI = cache.asURI(getArchiveURI());
        java.net.URI archiveJarURI = org.globalbioticinteractions.dataset.DatasetFinderUtil.getLocalDatasetURIRoot(new java.io.File(localArchiveURI));
        uri = org.eol.globi.util.ResourceUtil.getAbsoluteResourceURI(archiveJarURI, resourceName);
    }
    return uri;
}