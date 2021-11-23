private void createIfMissing(final java.io.File directory, final java.lang.String name) {
    if ((!(directory.exists())) && (!(directory.mkdirs()))) {
        if (!(directory.exists())) {
            throw new java.lang.AssertionError((((("Unable to create working directory: '" + directory) + "' it is the '") + name) + "' directory"));
        }
    }
}