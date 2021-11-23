private void reportStartWorkSource() {
    synchronized(mWifiStateTracker) {
        mTmpWorkSource.clear();
        if (mDeviceIdle) {
            synchronized(mLocks.mList) {
                for (int i = 0; i < (mLocks.mList.size()); i++) {
                    mTmpWorkSource.add(mLocks.mList.get(i).mWorkSource);
                }
            }
        }
        mWifiStateTracker.updateBatteryWorkSourceLocked(mTmpWorkSource);
        com.android.server.WifiService.sWakeLock.setWorkSource(mTmpWorkSource);
    }
}