public java.lang.Void call() throws java.lang.Exception {
    org.apache.commons.compress.archivers.zip.ScatterZipOutputStream streamToUse = tlScatterStreams.get();
    java.io.InputStream payload = source.get();
    try {
        streamToUse.addArchiveEntry(zipArchiveEntry, payload, method);
    } finally {
        payload.close();
    }
    return null;
}