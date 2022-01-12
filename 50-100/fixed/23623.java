public void sendResponse(java.lang.String sendWord) {
    if (((connectThread.getSocket()) != null) && (connectThread.getSocket().isConnected())) {
        if ((mmManagegedConnection) == null) {
            mmManagegedConnection = new com.monklu.bluetooth.com.monklu.bluetoothConnect.ManageConnectedThread(connectThread.getSocket());
        }
        mmManagegedConnection.write(sendWord);
    }
}