public void playNext() {
    int pos = playlist.getLastPlayedPosition();
    io.realm.RealmList<com.lukechenshui.beatpulse.models.Song> playlistSongs = playlist.getSongs();
    com.lukechenshui.beatpulse.models.Song nextSong;
    if ((pos + 1) <= ((playlistSongs.size()) - 1)) {
        pos++;
        playlist.setLastPlayedPosition(pos);
        nextSong = playlistSongs.get(pos);
    }else {
        nextSong = playlistSongs.first();
        playlist.setLastPlayedPosition(0);
    }
    playSong(nextSong);
}