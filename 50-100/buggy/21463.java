private synchronized void ensureConnection() {
    if (null == (transport)) {
        try {
            java.net.InetAddress address = java.net.InetAddress.getByName(hostname);
            transport = new java.net.Socket(address, port);
            transport.shutdownInput();
            readerService.addLogListener(this);
        } catch (java.io.IOException e) {
            if (consoleMessages) {
                java.lang.System.err.println(java.lang.String.format("Failed to connect to %s:%d => %s", hostname, port, e.getMessage()));
                e.printStackTrace();
            }
            transport = null;
        }
    }
}