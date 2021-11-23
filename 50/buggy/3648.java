private java.io.File getFile(final java.lang.String filename, final java.io.File workingDir) {
    java.io.File libDir = new java.io.File(filename);
    if (!(libDir.isAbsolute())) {
        libDir = new java.io.File(workingDir, filename);
    }
    return libDir;
}