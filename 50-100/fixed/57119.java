@java.lang.Override
public void playprev(boolean torf) {
    int position = getprevPos(torf);
    if ((position != (-1)) && (position < (playList.size()))) {
        playingIndex = position;
        CurrentSong = playList.get(playingIndex);
        fastplay();
    }
}