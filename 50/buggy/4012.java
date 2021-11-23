private long countChars(final java.io.File file) throws java.io.IOException {
    final java.io.FileReader reader = new java.io.FileReader(file);
    return reader.skip(java.lang.Long.MAX_VALUE);
}