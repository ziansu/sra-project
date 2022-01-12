public void addTrackToPlaylist(com.djrapitops.nmplayer.functionality.Track track) {
    if (track == null) {
        return ;
    }
    playlist.addFilePathToPlaylist(track);
    com.djrapitops.nmplayer.fileutils.PlaylistFileManager.save(playlist.getPlaylist(), selectedPlaylist, true);
    selectTrack(track);
}