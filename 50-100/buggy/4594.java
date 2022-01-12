private java.io.InputStream getInputStream(final se.simonsoft.cms.item.CmsItem item) {
    final java.io.PipedInputStream inputStream = new java.io.PipedInputStream();
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.io.PipedOutputStream outputStream = null;
            try {
                outputStream = new java.io.PipedOutputStream(inputStream);
                item.getContents(outputStream);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            } finally {
                org.apache.chemistry.opencmis.commons.impl.IOUtils.closeQuietly(inputStream);
                org.apache.chemistry.opencmis.commons.impl.IOUtils.closeQuietly(outputStream);
            }
        }
    }).start();
    return inputStream;
}