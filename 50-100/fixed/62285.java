private void createSymbolicLink(java.io.File srcFile, java.nio.file.Path dst) {
    try {
        au.org.emii.gogoduck.worker.GoGoDuck.logger.info(java.lang.String.format("Linking '%s' -> '%s'", srcFile, dst));
        java.nio.file.Files.createSymbolicLink(dst, srcFile.toPath());
    } catch (java.io.IOException e) {
        au.org.emii.gogoduck.worker.GoGoDuck.logger.error(e.getMessage(), e);
        throw new au.org.emii.gogoduck.exception.GoGoDuckException(e.getMessage(), e);
    }
}