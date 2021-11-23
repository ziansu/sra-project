@javax.annotation.Nonnull
private byte[] loadFromCacheFirst(java.lang.String id) {
    byte[] cached = loadFromCache(id);
    if (cached != null) {
        return cached;
    }
    try {
        return loadFromServer(id);
    } catch (java.lang.Exception e) {
        if ((e.getCause()) instanceof org.sonar.api.utils.HttpDownloader.HttpException) {
            throw e;
        }
    }
    throw new java.lang.IllegalStateException(org.sonar.batch.bootstrap.WSLoader.FAIL_MSG);
}