@java.lang.Override
public int returnpos() {
    if ((playingIndex) != (-1)) {
        return (playList.indexOf(CurrentSong)) != (-1) ? playList.indexOf(CurrentSong) : -1;
    }
    return -1;
}