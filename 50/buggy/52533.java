private void restart() {
    this.connection = null;
    setCurrentStatus(com.scvsoft.wipeer.NetworkService.NetworkStatus.DISCONNECTED);
    discoverPeers();
}