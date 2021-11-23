private void packMetadata(org.gradle.caching.internal.tasks.origin.TaskOutputOriginWriter writeMetadata, org.apache.tools.tar.TarOutputStream outputStream) throws java.io.IOException {
    org.apache.tools.tar.TarEntry entry = new org.apache.tools.tar.TarEntry(org.gradle.caching.internal.tasks.TarTaskOutputPacker.METADATA_PATH);
    entry.setMode(((org.apache.tools.zip.UnixStat.FILE_FLAG) | (org.apache.tools.zip.UnixStat.DEFAULT_FILE_PERM)));
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    writeMetadata.execute(baos);
    entry.setSize(baos.size());
    outputStream.putNextEntry(entry);
    outputStream.write(baos.toByteArray());
    outputStream.closeEntry();
}