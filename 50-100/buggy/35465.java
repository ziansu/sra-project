public void run() {
    btAdapter.cancelDiscovery();
    try {
        android.util.Log.d(com.robic.zoran.moonstalker.BlueToothService.TAG, "Startav gledat c srvr ce apstaja");
        mmSocket.connect();
        android.util.Log.d(com.robic.zoran.moonstalker.BlueToothService.TAG, "Jedavc sj kanektav");
    } catch (java.io.IOException connectException) {
        try {
            mmSocket.close();
        } catch (java.io.IOException ignored) {
        }
        return ;
    }
    h.obtainMessage(com.robic.zoran.moonstalker.BlueToothService.CONNECTION_ACCEPTED_MESSAGE).sendToTarget();
    btReadWrite = new com.robic.zoran.moonstalker.BlueToothService.BtReadWrite(mmSocket);
    btReadWrite.start();
}