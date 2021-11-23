private void executeAlarm() {
    java.util.List<com.doers.wakemeapp.common.model.audio.Song> songs = mCurrentAlarm.getPlaylist().getSongs();
    int randSong = new java.util.Random().nextInt(songs.size());
    com.doers.wakemeapp.common.model.audio.Song selectedSong = songs.get(randSong);
    java.lang.String songPath = selectedSong.getPath();
    startSoundService(songPath);
    displayNotification();
}