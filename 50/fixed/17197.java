public void nextSong() {
    (currentSongPosition)++;
    startSong(currentListSongs.get(currentSongPosition).getSongUri(), currentListSongs.get(currentSongPosition).getSongName());
}