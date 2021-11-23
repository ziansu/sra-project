public void initMediaPlayer() {
    mediaPlayer = new android.media.MediaPlayer();
    mediaPlayer.setOnPreparedListener(this);
    mediaPlayer.setOnErrorListener(this);
    mediaPlayer.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);
    setState(edu.calpoly.idulkin.podcrust.MediaPlayerService.MP_STATE.STOPPED);
}