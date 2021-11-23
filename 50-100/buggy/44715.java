org.infinity.util.io.zip.DlcFileAttributes getFileAttributes(byte[] path) throws java.io.IOException {
    org.infinity.util.io.zip.ZipNode folder = null;
    beginRead();
    try {
        ensureOpen();
        folder = root.getNode(path);
    } finally {
        endRead();
    }
    return new org.infinity.util.io.zip.DlcFileAttributes(folder);
}