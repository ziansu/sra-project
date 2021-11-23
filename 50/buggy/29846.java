@java.lang.Override
protected final void onHandleIntent(android.content.Intent intent) {
    processIntent(intent);
    com.onesignal.GcmBroadcastReceiver.completeWakefulIntent(intent);
}