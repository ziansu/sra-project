public void run() {
    btAdapter.cancelDiscovery();
    try {
        btSocket.connect();
    } catch (java.io.IOException e) {
        try {
            btSocket.close();
        } catch (java.io.IOException f) {
        }
        return ;
    }
    mChat.ncThread = null;
    mChat.connected(btSocket, btDevice);
}