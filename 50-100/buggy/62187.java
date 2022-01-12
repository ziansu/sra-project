public void run() {
    android.bluetooth.BluetoothSocket socket = null;
    while (true) {
        try {
            socket = mmServerSocket.accept();
        } catch (java.io.IOException e) {
            break;
        }
        if (socket != null) {
            manageConnectedSocket(socket);
            try {
                mmServerSocket.close();
            } catch (java.io.IOException e) {
                android.util.Log.e("ERROR", ("Was not in API example. " + ("Added catch block bc of syntax error -> " + "unhandled exception: java.io.ioexception")));
                e.printStackTrace();
            }
            break;
        }
    } 
}