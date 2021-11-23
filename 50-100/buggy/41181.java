public void playSong() {
    complete = false;
    mediaPlayer.reset();
    try {
        mediaPlayer.setDataSource(songs.get(currentPosition).getSongPath());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    mediaPlayer.prepareAsync();
}