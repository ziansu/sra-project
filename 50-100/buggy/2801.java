private void sendTimerInfo(java.lang.String action) {
    android.util.Log.i("TimerService", "sendTimerInfo called");
    timeInMillis = (android.os.SystemClock.uptimeMillis()) - (initialTime);
    android.content.Intent intent = new android.content.Intent(action);
    int timer = (initialTimeSpent) + ((int) (timeInMillis));
    intent.putExtra(com.sofi.knittimer.TimerService.EXTRA_KEY_ID, projectId);
    intent.putExtra(com.sofi.knittimer.TimerService.EXTRA_KEY_TIME_LEFT, timer);
    android.support.v4.content.LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
}