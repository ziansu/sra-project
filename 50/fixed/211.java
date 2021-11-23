@java.lang.Override
public void onDestroy() {
    if ((startIntent) != null) {
        android.support.v4.content.WakefulBroadcastReceiver.completeWakefulIntent(startIntent);
        startIntent = null;
    }
    super.onDestroy();
}