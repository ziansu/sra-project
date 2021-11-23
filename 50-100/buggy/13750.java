@java.lang.Override
public void run() {
    try {
        java.net.Socket s = new java.net.Socket(address.getHost(), net.fdloch.wifiPresenter.android.ControlActivity.PORT);
        conn = new net.fdloch.wifiPresenter.android.network.Connection(s);
        new net.fdloch.wifiPresenter.android.network.HandshakeLayer(this, conn, address.getPasscode());
        conn.start();
        cP = new net.fdloch.wifiPresenter.android.CommandProducer(conn, false);
    } catch (java.lang.Exception ex) {
        this.onError(new java.lang.Exception("Could not connect to server!", ex));
    }
}