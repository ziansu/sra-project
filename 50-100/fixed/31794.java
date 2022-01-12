private void addIfExists(final java.io.File fullFilePath, final java.lang.String fileName) {
    final java.io.File file = new java.io.File(fullFilePath, fileName);
    if (file.exists()) {
        final java.lang.String diff = org.apache.commons.lang.StringUtils.difference(baseDir, fullFilePath.getPath());
        files.add((diff + fileName));
    }
}