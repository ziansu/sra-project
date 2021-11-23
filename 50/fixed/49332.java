@java.lang.Override
public int returnpos() {
    return (playList.indexOf(CurrentSong)) != (-1) ? playList.indexOf(CurrentSong) : -1;
}