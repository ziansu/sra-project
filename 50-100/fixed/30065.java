@java.lang.Override
public void pause() {
    if ((mediaPlayer) == null)
        return ;
    
    if (mediaPlayer.isPlaying()) {
        mCurrentPosition = mediaPlayer.getCurrentPosition();
        mediaPlayer.pause();
        if (!(mediaPlayer.isPlaying()))
            refreshController(com.daomingedu.ijkplayertest.coustomview.PLAYER_STATE_PAUSE);
        else
            refreshController(com.daomingedu.ijkplayertest.coustomview.STATE_CURRENT_NULL);
        
    }else {
        refreshController(com.daomingedu.ijkplayertest.coustomview.STATE_CURRENT_NULL);
    }
}