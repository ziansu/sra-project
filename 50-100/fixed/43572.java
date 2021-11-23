public void nextSong() {
    if ((mSongList) != null) {
        (songListPosition)++;
        if ((mSongList.size()) <= (songListPosition))
            songListPosition = 0;
        
        if ((fragment) != null) {
            fragment.setCurrentSong(songListPosition);
            fragment.updateUI();
        }
        prepareSong();
        playSong();
    }
}