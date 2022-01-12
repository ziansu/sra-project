public void setSong(info.dourok.android.lyrics.SongWrapper song) {
    this.mSong = song;
    this.mLyrics = mSong.getLyrics();
    this.mLyricsItems = mLyrics.getLyricsItems();
    if ((song.getLyrics()) != null) {
        updateLyrics();
    }
}