@java.lang.Override
public void onCompletion(android.media.MediaPlayer mMediaPlayer) {
    releaseMediaPlayer();
    mAudioManager.abandonAudioFocus(afChangeListener);
}