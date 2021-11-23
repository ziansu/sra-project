public synchronized void stop() {
    if ((connectThread) != null) {
        connectThread.cancel();
        connectThread = null;
    }
    if ((connectedThread) != null) {
        connectedThread.cancel();
        connectedThread = null;
    }
    if ((acceptThread) != null) {
        acceptThread.cancel();
        acceptThread = null;
    }
    setServiceState(koshianpan.github.com.pontroller.BluetoothService.STATE_NONE);
}