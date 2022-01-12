protected void setConnectionStatus(boolean connected, android.bluetooth.BluetoothDevice device) {
    if (connected) {
        synchronized(this) {
            _isConnected = true;
            _connectedDevice = device;
        }
        synchronized(_newConnection) {
            _newConnection.notifyAll();
        }
    }else {
        synchronized(this) {
            _isConnected = false;
            _connectedDevice = null;
        }
        synchronized(_newDisconnection) {
            _newDisconnection.notifyAll();
        }
    }
}