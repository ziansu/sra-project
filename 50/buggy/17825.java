public void previousSong() {
    startSong(currentListSongs.get(((currentSongPosition) - 1)).getSongUri(), currentListSongs.get(((currentSongPosition) - 1)).getSongName());
    (currentSongPosition)--;
}