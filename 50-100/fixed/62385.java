@java.lang.Override
public void appendFile(java.lang.String path, java.io.File file) throws java.io.IOException {
    org.apache.commons.compress.archivers.tar.TarArchiveEntry entry = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file, path);
    synchronized(this) {
        tarOutput.putArchiveEntry(entry);
        try (java.io.FileInputStream fis = new java.io.FileInputStream(file)) {
            org.apache.commons.compress.utils.IOUtils.copy(fis, tarOutput);
        }
        tarOutput.closeArchiveEntry();
    }
}