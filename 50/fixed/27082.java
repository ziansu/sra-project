@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mConnectedThread) != null) {
        mConnectedThread.cancel();
        try {
            btSocket.close();
        } catch (java.io.IOException e2) {
            finish();
        }
    }
}