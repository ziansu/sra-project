public void pause() {
    if ((mPlayer) == null)
        return ;
    
    if (mPlayer.isPlaying())
        mPlayer.pause();
    
}