@java.lang.Override
protected void onStop() {
    super.onStop();
    if (mServiceBound) {
        unbindService(mConnection);
    }
}