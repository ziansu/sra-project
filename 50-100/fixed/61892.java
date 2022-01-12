private void storeFileEntry(java.io.File file, java.lang.String path, long lastModified, long size, int mode, org.apache.tools.tar.TarOutputStream outputStream) throws java.io.IOException {
    org.gradle.caching.internal.tasks.TarTaskOutputPacker.createTarEntry(path, lastModified, size, ((org.apache.tools.zip.UnixStat.FILE_FLAG) | mode), outputStream);
    com.google.common.io.Files.copy(file, outputStream);
    outputStream.closeEntry();
}