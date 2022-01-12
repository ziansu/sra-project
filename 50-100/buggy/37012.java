@java.lang.Override
protected void onStop() {
    if (focusDuringOnPause) {
        if ((AlarmBroadcastReceiver.wakeLock) != null) {
            AlarmBroadcastReceiver.wakeLock.release();
            AlarmBroadcastReceiver.wakeLock = null;
        }
        if ((mediaPlayer) != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        if ((taskCountdown) != null) {
            taskCountdown.cancel();
        }
        finish();
    }
    super.onStop();
}