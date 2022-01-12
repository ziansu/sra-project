@java.lang.Override
public <T> T appendFile(java.lang.String path, gov.nist.isg.archiver.FileAppender<T> appender) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    T result = appender.append(baos);
    org.apache.commons.compress.archivers.tar.TarArchiveEntry entry = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path);
    entry.setSize(baos.size());
    synchronized(this) {
        tarOutput.putArchiveEntry(entry);
        tarOutput.write(baos.toByteArray());
        tarOutput.closeArchiveEntry();
    }
    return result;
}