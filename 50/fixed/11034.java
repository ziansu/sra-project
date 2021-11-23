@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    progressBarHandler.removeCallbacks(mUpdateTimeTask);
    java.lang.Thread.currentThread().interrupt();
    unregisterReceiver(mediaControlsBroadcastReceiver);
    player.release();
    player = null;
    return super.onUnbind(intent);
}