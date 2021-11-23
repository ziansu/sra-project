public void setSong(info.dourok.android.lyrics.SongWrapper song) {
    this.mSong = song;
    if ((song.getLyrics()) != null) {
        this.mLyrics = mSong.getLyrics();
        this.mLyricsItems = mLyrics.getLyricsItems();
        updateLyrics();
    }
}