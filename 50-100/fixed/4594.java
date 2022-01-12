private java.io.InputStream getInputStream(final se.simonsoft.cms.item.CmsItem item) {
    java.io.PipedInputStream inputStream;
    final java.io.PipedOutputStream outputStream;
    try {
        inputStream = new java.io.PipedInputStream();
        outputStream = new java.io.PipedOutputStream(inputStream);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                item.getContents(outputStream);
            } finally {
                org.apache.chemistry.opencmis.commons.impl.IOUtils.closeQuietly(outputStream);
            }
        }
    }).start();
    return inputStream;
}