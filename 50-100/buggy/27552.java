@java.lang.Override
protected void onStop() {
    super.onPause();
    if ((mGattServer) != null) {
        mGattServer.close();
    }
    if ((mAdvertiser) != null) {
        mAdvertiser.stopAdvertising(mAdvCallback);
    }
    resetStatusViews();
}