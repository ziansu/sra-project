@java.lang.Override
public void playnext(boolean torf) {
    int position = getnextPos(torf);
    if ((position >= 0) && (position < (playList.size()))) {
        playingIndex = position;
        CurrentSong = playList.get(playingIndex);
        fastplay();
    }else {
        isPlaying = false;
        paused = true;
        updateService(com.rks.musicx.misc.utils.Constants.PLAYSTATE_CHANGED);
    }
}