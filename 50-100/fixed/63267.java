@java.lang.Override
public void onStateChanged(boolean playWhenReady, @org.bottiger.podcast.player.exoplayer.ExoPlayerWrapper.PlayerState
int playbackState) {
    if ((mEpisode) == null)
        return ;
    
    long base = (android.os.SystemClock.elapsedRealtime()) - (mEpisode.getOffset());
    setBase(base);
    if (playWhenReady && (!(mIsTicking))) {
        start();
    }else
        if ((!playWhenReady) && (mIsTicking)) {
            stop();
        }
    
    mIsTicking = playWhenReady;
}