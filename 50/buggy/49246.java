public void replay() {
    if (!(mPlayer.isPlaying()))
        mPlayer.start();
    
    startTimingThread();
}