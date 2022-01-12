private void restart() {
    if ((this.connection) != null) {
        this.connection.end();
        this.connection = null;
    }
    setCurrentStatus(com.scvsoft.wipeer.NetworkService.NetworkStatus.DISCONNECTED);
    discoverPeers();
}