@java.lang.Override
public void run() {
    try {
        java.net.Socket s = new java.net.Socket(address.getHost(), net.fdloch.wifiPresenter.android.ControlActivity.PORT);
        conn = new net.fdloch.wifiPresenter.android.network.Connection(s);
        new net.fdloch.wifiPresenter.android.network.HandshakeLayer(listener, conn, address.getPasscode());
        conn.start();
        cP = new net.fdloch.wifiPresenter.android.CommandProducer(conn, false);
    } catch (java.lang.Exception ex) {
        listener.onError(new java.lang.Exception("Could not connect to server!", ex));
    }
}