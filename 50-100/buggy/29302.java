private void initMediaPlayer() {
    mp = new android.media.MediaPlayer();
    mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
    mp.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);
    mp.setOnPreparedListener(this);
    mp.setOnErrorListener(this);
    mp.setOnCompletionListener(this);
    mp.setOnBufferingUpdateListener(this);
    mp.setOnSeekCompleteListener(this);
    mServiceState = com.linhphan.music.util.MusicServiceState.idle;
}