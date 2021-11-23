public boolean populatePlaylistIfEmpty() {
    if (org.bottiger.podcast.playlist.Playlist.mInternalPlaylist.isEmpty()) {
        populatePlaylist(org.bottiger.podcast.playlist.Playlist.MAX_SIZE);
        return true;
    }
    return false;
}