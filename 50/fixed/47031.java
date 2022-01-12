@java.lang.Override
protected void onPause() {
    super.onPause();
    if (mIsBind) {
        unbindService(mServiceConnection);
        mIsBind = false;
    }
    finish();
}