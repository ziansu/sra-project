@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    android.util.Log.i(com.tan.musicplayer.playService.PlayService.TAG, "onPrepared: ");
    mp.start();
    changePlayerState(true);
    changeNotificationMessage();
    com.tan.musicplayer.MusicPlayerApplication.executeDBRunning(mRencentDBRunnable);
}