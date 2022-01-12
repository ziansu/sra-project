private void setupCacheDir() {
    if ((cacheDir) == null) {
        java.lang.String cacheDirName = ".vertx/file-cache-" + (java.util.UUID.randomUUID().toString());
        cacheDir = new java.io.File(cacheDirName);
        if (cacheDir.exists()) {
            vertx.fileSystem().deleteRecursiveBlocking(cacheDir.getAbsolutePath(), true);
        }else {
            if (!(cacheDir.mkdirs())) {
                throw new java.lang.IllegalStateException("Failed to create cache dir");
            }
        }
    }
}