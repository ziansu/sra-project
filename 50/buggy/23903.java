public void setRemotePort(int remotePort) {
    if (remotePort != 0) {
        throw new java.lang.IllegalStateException(("remotePort already set to :" + remotePort));
    }
    this.remotePort = remotePort;
}