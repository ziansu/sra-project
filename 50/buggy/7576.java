@java.lang.Override
public void onDestroy() {
    mMediaPlayerPrepared = false;
    mPlayer.stop();
    mPlayer.release();
    stopForeground(true);
}