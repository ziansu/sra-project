private java.io.File buildRootTempDir(java.util.logging.Logger logger) throws java.io.IOException {
    java.io.File result = java.io.File.createTempFile("alvisnlp", "", tmpDir);
    result.delete();
    result.mkdirs();
    logger.config(("temporary directory: " + (result.getCanonicalPath())));
    return result;
}