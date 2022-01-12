public void close() throws java.io.IOException {
    net.fdloch.wifiPresenter.android.network.Connection.log.debug("Going to close socket...");
    this.socket.close();
    this.in.close();
    this.out.close();
    net.fdloch.wifiPresenter.android.network.Connection.log.debug("Successfully closed socket!");
}