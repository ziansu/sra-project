@javax.annotation.Nonnull
private byte[] loadFromServerFirst(java.lang.String id) {
    try {
        return loadFromServer(id);
    } catch (java.lang.Exception serverException) {
        if ((serverException.getCause()) instanceof org.sonar.api.utils.HttpDownloader.HttpException) {
            throw serverException;
        }
        byte[] cached = loadFromCache(id);
        if (cached != null) {
            return cached;
        }
    }
    throw new java.lang.IllegalStateException(org.sonar.batch.bootstrap.WSLoader.FAIL_MSG);
}