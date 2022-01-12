@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    android.util.Log.i("Check", "onCompletion");
    divyang.musicapp_v6.BackgroundMediaService.mediaPlayer.stop();
    setMediaPlaybackState(PlaybackState.STATE_STOPPED);
    showPausedNotification();
}