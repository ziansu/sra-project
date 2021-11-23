@java.lang.Override
public void connectionEstablished(net.raceconditions.telescopegps.TCPClient tcpClient) {
    mTcpClient = tcpClient;
    createUpdateButton();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(context, "The telescope is successfully connected.", Toast.LENGTH_LONG).show();
            createUpdateButton();
        }
    });
    android.util.Log.i("GPSLocationSync", "Telescope connected");
}