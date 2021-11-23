private void finish() {
    com.tonyjhuang.whereyou.receivers.WakefulWhereYouBroadcastReceiver.completeWakefulIntent(intent);
    wakefulLooper.quit();
}