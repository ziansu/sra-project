public synchronized void shutdown() {
    if ((httpClient) != null) {
        groovejames.util.IOUtils.closeQuietly(httpClient);
        httpClient = null;
    }
}