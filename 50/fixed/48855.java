public boolean populatePlaylistIfEmpty() {
    if (org.bottiger.podcast.playlist.Playlist.mInternalPlaylist.isEmpty()) {
        populatePlaylist();
        return true;
    }
    return false;
}