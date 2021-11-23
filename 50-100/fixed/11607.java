private void handleFoundAllFiles(final java.util.Set<java.io.File> allFiles) throws java.io.IOException {
    if ((wildcardExpanderHandler) != null) {
        try {
            wildcardExpanderHandler.transform(allFiles);
        } catch (final java.lang.Exception e) {
            if (e instanceof java.io.IOException) {
                throw ((java.io.IOException) (e));
            }
            throw new java.io.IOException(("Exception during expanding wildcard: " + (e.getMessage())));
        }
    }
}