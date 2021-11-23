public void playSong() {
    player.reset();
    com.chopin.Song playSong = songs.get(songPosn);
    long currSong = playSong.getID();
    songTitle = playSong.getTitle();
    android.net.Uri trackUri = android.content.ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, currSong);
    try {
        player.setDataSource(getApplicationContext(), trackUri);
    } catch (java.lang.Exception e) {
        android.util.Log.e("MUSIC SERVICE", "Error setting data source", e);
    }
    player.prepareAsync();
}