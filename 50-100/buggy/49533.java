private void scheduleStopForegroundChecker(java.lang.String source) {
    android.util.Log.i(LOG_TAG, ("scheduleStopForegroundChecker - source: " + source));
    if ((stopForegroundRunnable) != null) {
        handler.removeCallbacks(stopForegroundRunnable);
    }
    stopForegroundRunnable = new au.com.kbrsolutions.spotifystreamer.services.MusicPlayerService.StopForegroundRunnable((source + ".scheduleStopForegroundChecker"));
    handler.postDelayed(stopForegroundRunnable, ((WAIT_TIME_BEFORE_SERVICE_SHUTDOWN_AFTER_LAST_ACTIVITY_UNBOUND_SECS) * 1000));
}