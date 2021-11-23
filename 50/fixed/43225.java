public void initMusicPlayer() {
    player.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);
    player.setAudioStreamType(AudioManager.STREAM_MUSIC);
    player.setOnCompletionListener(this);
    player.setOnErrorListener(this);
}