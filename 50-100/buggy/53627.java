@java.lang.Override
public void run() {
    try {
        android.util.Log.v(tag, "serverThread run ");
        android.bluetooth.BluetoothServerSocket server_bt_socket = myBtAdapter.listenUsingRfcommWithServiceRecord("myServerSocket", java.util.UUID.fromString(string_uuid));
        android.util.Log.v(tag, "wait client request");
        server_socket = server_bt_socket.accept();
        android.util.Log.v(tag, "accepted  client request");
        chat_handler.sendEmptyMessage(server_ready);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}