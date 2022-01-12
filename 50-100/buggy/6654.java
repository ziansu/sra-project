public synchronized void stop() {
    if ((acceptThread) != null) {
        acceptThread.cancel();
        acceptThread = null;
    }
    if ((connectThread) != null) {
        connectThread.cancel();
        connectThread = null;
    }
    if ((connectedThread) != null) {
        connectedThread.cancel();
        connectedThread = null;
    }
    setServiceState(koshianpan.github.com.pontroller.BluetoothService.STATE_NONE);
}