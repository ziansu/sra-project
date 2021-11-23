@java.lang.Override
public boolean isPlaying() {
    if (this.isFinishing()) {
        return false;
    }else
        if ((((currentState) == (com.piglettee.maxpipes.StreamPlayer.PlayerState.RESTARTING)) || ((currentState) == (com.piglettee.maxpipes.StreamPlayer.PlayerState.STOPPING))) || ((currentState) == (com.piglettee.maxpipes.StreamPlayer.PlayerState.PREPARING))) {
            return false;
        }
    
    return mediaPlayer.isPlaying();
}