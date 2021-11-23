public void sendResponse(java.lang.String sendWord) {
    if (((connectThread.getSocket()) != null) && (connectThread.getSocket().isConnected())) {
        mmManagegedConnection = new com.monklu.bluetooth.com.monklu.bluetoothConnect.ManageConnectedThread(connectThread.getSocket());
        mmManagegedConnection.write(sendWord);
    }
}