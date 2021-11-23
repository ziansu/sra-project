public void run() {
    while (true) {
        android.bluetooth.BluetoothSocket socket = null;
        try {
            socket = mmServerSocket.accept();
            connectedThread = new com.bluetooth.icollect.bluetooth.MainActivity.ConnectedThread(socket);
            connectedThread.start();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            break;
        }
    } 
}