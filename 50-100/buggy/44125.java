public void setHostAndPort(java.lang.String host, int port) {
    if (((this.host) != host) || ((this.port) != port)) {
        try {
            renewClient();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    this.host = host;
    this.port = port;
}