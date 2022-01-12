private java.lang.String getDirectoryRoot(java.nio.file.Path path, java.lang.String mediaFolderPath) {
    java.io.File dir = path.toFile();
    if (!(dir.isDirectory())) {
        return null;
    }
    if (dir.getParent().equals(mediaFolderPath)) {
        return null;
    }
    if (containsMedia(dir.getParentFile(), false)) {
        return null;
    }
    return dir.getParentFile().getName();
}