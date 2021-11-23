public void updateMainPage() {
    net.classicgarage.truerandommusicplayer.model.SongItem song = mBaseService.getPlayingSong();
    if (song != null) {
        mSongTitleTv.setText(song.getTitle());
        mAuthorTv.setText(song.getArtist());
        mAlbumTv.setText(song.getAlbum());
    }else
        mSongTitleTv.setText("No music stored in this phone.");
    
    updateButtonDisplay();
}