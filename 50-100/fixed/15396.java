private void closeStream() {
    logger.debug("Closing output stream");
    if ((fsDataOutputStream) != null) {
        try {
            fsDataOutputStream.close();
        } catch (java.io.IOException e) {
            org.apache.hadoop.io.IOUtils.closeStream(fsDataOutputStream);
            throw new org.springframework.data.hadoop.store.StoreException("Error while closing stream", e);
        } finally {
            fsDataOutputStream = null;
        }
    }
}