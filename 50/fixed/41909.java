public void changeStateSong() {
    if (mPlayer.isPlaying()) {
        isPlaying = false;
        mPlayer.pause();
    }else {
        isPlaying = true;
        mPlayer.start();
    }
}