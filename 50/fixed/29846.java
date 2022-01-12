@java.lang.Override
protected final void onHandleIntent(android.content.Intent intent) {
    if (intent == null)
        return ;
    
    processIntent(intent);
    com.onesignal.GcmBroadcastReceiver.completeWakefulIntent(intent);
}