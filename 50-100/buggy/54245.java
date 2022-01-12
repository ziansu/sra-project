public long lastModified(org.onestonesoup.openforum.filemanager.Resource resource) {
    long lastModified = 0;
    for (org.onestonesoup.openforum.filemanager.ResourceStore resourceStore : resourceStores) {
        if (resourceStore.resourceExists(resource)) {
            if ((lastModified == 0) || ((resourceStore.lastModified(resource)) < lastModified)) {
                lastModified = resourceStore.lastModified(resource);
            }
        }
    }
    return lastModified;
}