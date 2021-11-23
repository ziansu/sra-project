public synchronized void connect(java.lang.String address) {
    android.bluetooth.BluetoothDevice device = btAdapter.getRemoteDevice(address);
    android.util.Log.d(com.henrykvdb.sttt.BtService.TAG, ("connect to: " + device));
    start();
    connectingThread = new com.henrykvdb.sttt.BtService.ConnectingThread(device);
    connectingThread.start();
}