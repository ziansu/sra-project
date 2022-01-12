public void run() {
    android.bluetooth.BluetoothSocket socket = null;
    while (true) {
        try {
            socket = mmServerSocket.accept();
        } catch (java.io.IOException e) {
            break;
        }
        if (socket != null) {
            java.lang.Thread manageConnectedSocket = new com.bluetask.bluetooth.ConnectedThread(socket);
            manageConnectedSocket.start();
            try {
                mmServerSocket.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            break;
        }
    } 
}