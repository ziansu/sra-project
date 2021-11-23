protected void setConnectionStatus(boolean connected) {
    if (connected) {
        synchronized(this) {
            _isConnected = true;
        }
        synchronized(_newConnection) {
            _newConnection.notifyAll();
        }
    }else {
        synchronized(this) {
            _isConnected = false;
        }
        synchronized(_newDisconnection) {
            _newDisconnection.notifyAll();
        }
    }
}