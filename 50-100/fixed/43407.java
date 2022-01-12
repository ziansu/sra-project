private static java.io.File getCacheDirectory(java.io.File storageDir) {
    final java.io.File cacheDirectory = new java.io.File(storageDir, "cache");
    if ((!(cacheDirectory.mkdirs())) && (!(cacheDirectory.exists()))) {
        throw new java.lang.RuntimeException((("Could not create cache directory '" + (cacheDirectory.getAbsolutePath())) + "'."));
    }
    return cacheDirectory;
}