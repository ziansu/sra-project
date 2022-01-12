private void setupCacheDir() {
    java.lang.String cacheDirName = ".vertx/file-cache-" + (java.util.UUID.randomUUID().toString());
    cacheDir = new java.io.File(cacheDirName);
    if (!(cacheDir.mkdirs())) {
        throw new java.lang.IllegalStateException("Failed to create cache dir");
    }
}