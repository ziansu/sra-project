public void switchSong(onion.szxb74om7zsmd2jm.limitlesslabyrinth.mechanics.MusicDirector.SongName s) {
    this.setNowPlaying(s);
    if (this.nowPlaying.isPlaying()) {
        this.stop();
    }
    this.play();
}