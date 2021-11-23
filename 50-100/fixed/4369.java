private void startTimerIfNecessary() {
    android.util.Log.d(com.ozzyboshi.internetbeattimewatchface.InternetBeatTimeWatchFaceService.TAG, "Start of startTimerIfNecessary - remove callbacks");
    timeTick.removeCallbacks(timeRunnable);
    if ((isVisible()) && (!(isInAmbientMode()))) {
        timeTick.post(timeRunnable);
    }else
        if ((isVisible()) && ((watchFace) != null)) {
            android.util.Log.d(com.ozzyboshi.internetbeattimewatchface.InternetBeatTimeWatchFaceService.TAG, "End of startTimerIfNecessary - start timeTick with beatsRunnable");
            timeTick.post(beatsRunnable);
        }
    
}