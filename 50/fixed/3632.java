private synchronized boolean playTrackOfPlaylist(int playListId, int trackId) {
    if (!(trackQueue.setPlaylist(playListId))) {
        return false;
    }
    trackQueue.setCurrentTrack(trackId);
    return playCurrentTrack();
}