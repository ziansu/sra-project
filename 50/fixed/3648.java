private java.io.File getFile(final java.lang.String filename, final java.io.File workingDir) {
    java.io.File file = new java.io.File(filename);
    if (!(file.isAbsolute())) {
        file = new java.io.File(workingDir, filename);
    }
    return file;
}