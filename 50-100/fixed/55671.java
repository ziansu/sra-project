static synchronized void powerLock(android.content.Context mContext) {
    if ((com.kivSW.phonerecorder.BlueToothService.powerWakeLock) == null) {
        android.os.PowerManager pm = ((android.os.PowerManager) (mContext.getSystemService(Context.POWER_SERVICE)));
        com.kivSW.phonerecorder.BlueToothService.powerWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "bluelock");
    }
    com.kivSW.phonerecorder.BlueToothService.powerWakeLock.acquire();
}