@java.lang.Override
protected void onPause() {
    super.onPause();
    rc.stop();
    pauseTime = java.lang.System.currentTimeMillis();
    totalForgroundTime = (tinydb.getLong("TotalForegroundTime", 0)) + ((pauseTime) - (resumeTime));
    tinydb.putLong("TotalForegroundTime", totalForgroundTime);
}