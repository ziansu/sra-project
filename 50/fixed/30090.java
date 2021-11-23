void onViewInitialized(java.util.List<pl.rmakowiecki.simplemusicplayer.model.Song> songPlaybackList, int currentSongIndex) {
    this.currentSongIndex = currentSongIndex;
    view.loadAlbumCoverImage(currentSongIndex);
}