public long lastModified() {
    try {
        init();
    } catch (final java.io.IOException e) {
        return lastModified;
    }
    if ((resource) != null) {
        return resource.getMetadata().getLastModified();
    }
    if (((collection) != null) || ((lastModified) != 0)) {
        return collection.getCreationTime();
    }
    return lastModified;
}