public java.lang.String[] getResourceNames() {
    if (null != (resourcesList)) {
        return resourcesList.toArray(new java.lang.String[resourcesList.size()]);
    }
    if (null != (basedirListing)) {
        return basedirListing.toArray(new java.lang.String[basedirListing.size()]);
    }
    java.lang.String[] list = com.dtolabs.rundeck.core.plugins.ZipResourceLoader.listZipPath(zipFile, resourcesBasedir);
    if (null != list) {
        basedirListing = java.util.Arrays.asList(list);
        return list;
    }
    return null;
}