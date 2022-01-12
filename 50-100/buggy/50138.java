public synchronized void start() {
    if (mierzwa.rafal.smartmouse2.BluetoothChatService.D)
        android.util.Log.d(mierzwa.rafal.smartmouse2.BluetoothChatService.TAG, "start");
    
    if ((mConnectThread) != null) {
        mConnectThread.cancel();
        mConnectThread = null;
    }
    if ((mConnectedThread) != null) {
        mConnectedThread.cancel();
        mConnectedThread = null;
    }
    if ((mAcceptThread) == null) {
        mAcceptThread = new mierzwa.rafal.smartmouse2.BluetoothChatService.AcceptThread();
        mAcceptThread.start();
    }
    setState(mierzwa.rafal.smartmouse2.BluetoothChatService.STATE_LISTEN);
}