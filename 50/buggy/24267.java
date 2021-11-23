static void closeQuietly(java.io.Closeable closeable) {
    if (closeable != null) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            org.webjars.CloseQuietly.log.debug("Exception while closing resource", e);
        }
    }
}