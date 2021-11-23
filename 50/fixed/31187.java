public void pause() {
    setMusicIsPlaying(false);
    mPlayer.stop();
    mPlayer.release();
    mPlayer = null;
}