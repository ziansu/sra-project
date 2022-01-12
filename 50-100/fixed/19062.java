public java.io.File createTargetFile(final java.lang.String lastPartName) {
    final java.lang.String intermediatePart = java.lang.String.format(fileSinkProperties.getIntermediatePattern(), java.time.LocalDateTime.now());
    final java.io.File targetDirectory = new java.io.File(baseDirectory, intermediatePart);
    if ((!(targetDirectory.isDirectory())) && (!(targetDirectory.mkdirs()))) {
        throw new java.lang.IllegalStateException(("Cannot create target directory " + (targetDirectory.getAbsolutePath())));
    }
    return new java.io.File(targetDirectory, lastPartName);
}