@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    audioManager.abandonAudioFocus(afChangeListener);
    mediaPlayer.release();
    mediaPlayer = null;
}