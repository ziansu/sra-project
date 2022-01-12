public void pause() {
    timePause = java.lang.System.currentTimeMillis();
    threshold.pause();
    mVibrator.cancel();
    sensorHandler.onDestroy();
    mMusicPlayer.stopSong();
}