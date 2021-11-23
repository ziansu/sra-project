public void replay() {
    if ((mPlayer) == null)
        return ;
    
    if (!(mPlayer.isPlaying()))
        mPlayer.start();
    
    startTimingThread();
}