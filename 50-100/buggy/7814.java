protected void connectSocket() {
    try {
        mSocket.connect();
    } catch (java.io.IOException e) {
        android.util.Log.e(es.carlosrolindez.btcomm.btsppcomm.BtSppClientSocket.TAG, "Spp Connected - Exception Connecting socket");
        android.util.Log.e(es.carlosrolindez.btcomm.btsppcomm.BtSppClientSocket.TAG, e.toString());
        try {
            mSocket.close();
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
        return ;
    }
    mCommManager.setSocket(mSocket, false);
}