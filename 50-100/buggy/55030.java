private void reportStartWorkSource() {
    synchronized(mWifiStateTracker) {
        mTmpWorkSource.clear();
        if (mDeviceIdle) {
            try {
                for (int i = 0; i < (mLocks.mList.size()); i++) {
                    mTmpWorkSource.add(mLocks.mList.get(i).mWorkSource);
                }
            } catch (java.lang.IndexOutOfBoundsException $missing$) {
            }
        }
        mWifiStateTracker.updateBatteryWorkSourceLocked(mTmpWorkSource);
        com.android.server.WifiService.sWakeLock.setWorkSource(mTmpWorkSource);
    }
}