public java.net.URL getNextServerUrl() {
    synchronized(serverUrls) {
        if (serverUrls.isEmpty()) {
            throw new java.lang.RuntimeException(("No server is found for " + (protocol.getName())));
        }else {
            lastIndex = ((lastIndex) + 1) % (serverUrls.size());
            return serverUrls.get(lastIndex);
        }
    }
}