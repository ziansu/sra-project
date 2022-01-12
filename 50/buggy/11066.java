public void addSong(tdd.musicdb.Song song) {
    if ((song.getArtist()) == null) {
        song.setArtist(this.artist);
    }
    this.songs.add(song);
}