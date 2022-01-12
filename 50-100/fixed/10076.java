public void run() {
    android.bluetooth.BluetoothSocket socket;
    while (true) {
        try {
            socket = serverSocket.accept();
        } catch (java.io.IOException e) {
            break;
        }
        if (socket != null) {
            listenOnSocket(socket);
            try {
                serverSocket.close();
            } catch (java.io.IOException e) {
            }
            break;
        }
    } 
}