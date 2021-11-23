private org.infinity.util.io.zip.DlcPath checkPath(java.nio.file.Path path) {
    if (path == null) {
        throw new java.lang.NullPointerException();
    }
    if (!(path instanceof org.infinity.util.io.zip.DlcPath)) {
        throw new java.nio.file.ProviderMismatchException();
    }
    return ((org.infinity.util.io.zip.DlcPath) (path));
}