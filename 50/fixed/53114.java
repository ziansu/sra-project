public void playNext() {
    for (int i = 0; i < (songManager.size()); i++) {
        playSong(songManager.getSongId(i));
    }
}