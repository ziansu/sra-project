public void playSong() {
    mediaPlayer.reset();
    try {
        mediaPlayer.setDataSource(songs.get(currentPosition).getSongPath());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    mediaPlayer.prepareAsync();
}