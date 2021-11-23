@java.lang.Override
public long getLastModifiedTime(final java.lang.String path) throws com.netflix.genie.common.exceptions.GenieException {
    try {
        return new java.io.File(path).lastModified();
    } catch (java.lang.Exception e) {
        final java.lang.String message = java.lang.String.format("Failed getting the last modified time for file with path %s", path);
        log.error(message, e);
        throw new com.netflix.genie.common.exceptions.GenieServerException(message, e);
    }
}