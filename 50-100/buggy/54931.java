@java.lang.Override
public void onClick(android.view.View v) {
    android.view.View button = findViewById(R.id.client_button);
    if (button != null)
        button.setEnabled(false);
    
    sendStateMessage(((java.lang.String) (getResources().getText(R.string.launching_client))));
    mConnectThread = new com.rcsnet.bluetoothmonitor.ConnectThread(((com.rcsnet.bluetoothmonitor.BluetoothClientServer) (getParent())), mDevice);
    mConnectThread.start();
}