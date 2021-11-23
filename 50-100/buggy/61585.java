public void previousSong() {
    (songListPosition)--;
    if ((songListPosition) < 0)
        songListPosition = (mSongList.size()) - 1;
    
    if ((fragment) != null) {
        fragment.setCurrentSong(songListPosition);
        fragment.updateUI();
    }
    prepareSong();
    playSong();
}