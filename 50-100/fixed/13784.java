public long lastModified() {
    try {
        init();
    } catch (final java.io.IOException e) {
        return lastModified;
    }
    if ((resource) != null) {
        return resource.getMetadata().getLastModified();
    }
    if ((collection) != null) {
        return collection.getCreationTime();
    }
    return lastModified;
}