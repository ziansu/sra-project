@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_menu);
    mBtAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if ((mBtAdapter) == null) {
        android.widget.Toast.makeText(this, "Bluetooth is not available", Toast.LENGTH_LONG).show();
        return ;
    }
    if (EnableBluetooth()) {
        mBtServer = new com.kovfil.hangman.networking.BluetoothServer(mBtAdapter, this);
        mBtServer.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}