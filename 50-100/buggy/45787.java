@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d(com.example.andrew.prokhor.eyecare.services.CounterServiceManager.LOG_TAG, ("onStartCommand(), startId = " + startId));
    startForeground(NotificationUtil.COUNTER_SERVICE_MANAGER_NOTIFICATION_ID, getForegroundNotification());
    mScreenOnReceiver = new android.content.BroadcastReceiver() {
        @java.lang.Override
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.util.Log.d(com.example.andrew.prokhor.eyecare.services.CounterServiceManager.LOG_TAG, "screen on receiver onReceive()");
            com.example.andrew.prokhor.eyecare.services.CounterService.launchService(context);
        }
    };
    android.content.IntentFilter filter = new android.content.IntentFilter(android.content.Intent.ACTION_SCREEN_ON);
    registerReceiver(mScreenOnReceiver, filter);
    return START_STICKY;
}