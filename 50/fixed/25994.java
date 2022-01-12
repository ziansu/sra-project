private boolean requestAudioFocus() {
    mAudioManager = ((android.media.AudioManager) (getSystemService(Context.AUDIO_SERVICE)));
    int result = mAudioManager.requestAudioFocus(afChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
    return result == (android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED);
}