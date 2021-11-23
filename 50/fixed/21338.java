private void finish() {
    wakefulLooper.quit();
    com.tonyjhuang.whereyou.receivers.WakefulWhereYouBroadcastReceiver.completeWakefulIntent(intent);
}