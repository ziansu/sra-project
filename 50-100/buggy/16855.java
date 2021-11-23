protected void cacheGlobalFile(java.lang.String relativePath, java.io.File file) throws com.sitewhere.spi.SiteWhereException {
    com.sitewhere.spi.resource.IResource resource = createResourceFromFile(relativePath, file);
    getGlobalResourceMap().put(relativePath, resource);
    com.sitewhere.server.resource.FileSystemResourceManager.LOGGER.debug((((((("Cached resource: " + (resource.getPath())) + " (") + (resource.getResourceType().name())) + ") ") + (resource.getContent().length)) + " bytes"));
}