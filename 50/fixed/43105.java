@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    audioManager.abandonAudioFocus(afChangeListener);
    if (mp != null) {
        mp.release();
    }
}