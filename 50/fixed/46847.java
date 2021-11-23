@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((mGattServer) != null) {
        mGattServer.close();
    }
    if ((mAdvertiser) != null) {
        mAdvertiser.stopAdvertising(mAdvCallback);
    }
    resetStatusViews();
}