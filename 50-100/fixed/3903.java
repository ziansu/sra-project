boolean addSongsFrom(Array_Playlist p) {
    Song placeholder = new Song("", "", 0);
    for (int i = 0; i < (p.totalSongs()); i++) {
        playlist.add(p.getSongAt(placeholder, (i + 1)));
    }
    return true;
}