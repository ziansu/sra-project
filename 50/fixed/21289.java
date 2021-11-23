public void setHostname(java.lang.String host) throws java.io.IOException {
    hostname = host;
    synchronized(this) {
        this.host = java.net.InetAddress.getByName(host).getAddress();
    }
}