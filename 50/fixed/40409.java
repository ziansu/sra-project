public void disconnect() {
    mHandler.removeCallbacks(mPruneTask);
    if ((mService) != null) {
        mService.setBeaconEventListener(null);
        mContext.unbindService(this);
    }
}