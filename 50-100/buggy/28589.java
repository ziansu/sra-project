public void run() {
    try {
        android.bluetooth.BluetoothAdapter mAdapter;
        mAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        serverSocket = mAdapter.listenUsingRfcommWithServiceRecord(com.example.ibrahim.myapplication.BluetoothChat.NAME, java.util.UUID.fromString(mUUID));
        socket = serverSocket.accept();
        if ((socket) != null) {
            CTED = new com.example.ibrahim.myapplication.BluetoothChat.ConnectedThread(socket);
        }
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
    }
}