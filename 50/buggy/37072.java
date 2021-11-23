@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    mediaPlayer.stop();
    mediaPlayer.release();
    seekBarUpdateHandler.removeCallbacks(seekBarUpdateRunnable);
    return false;
}