@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mConnectedThread) != null) {
        mConnectedThread.write("0");
        mConnectedThread.interrupt();
    }
    stopBluetoothReader();
}