@java.lang.Override
public void onConnectSuccess(com.btwiz.library.BTSocket btSocket) {
    android.util.Log.e("Main", "Connect Success");
    this.socket = btSocket;
    controlling = true;
    btDisconnectedReceiver = new com.rewaveapp.BtDisconnectedReceiver(this);
    registerReceiver(btDisconnectedReceiver, new android.content.IntentFilter(android.bluetooth.BluetoothDevice.ACTION_ACL_DISCONNECTED));
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            findViewById(R.id.progress_indicator_central).setVisibility(View.GONE);
            setTitle(R.string.controller_connection_success);
            ((com.rewaveapp.ControllerFragment) (getFragmentManager().findFragmentById(R.id.container))).onConnectionSuccess();
        }
    });
}