private void nextSong() {
    if ((mSongs) == null) {
        return ;
    }
    int index = mCurrentSong;
    index++;
    if (index >= (mSongs.size())) {
        index = 0;
    }
    playSong(index);
}