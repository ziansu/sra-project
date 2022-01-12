private synchronized boolean playPlaylist(int playListId, int firstId) {
    trackQueue.setPlaylist(playListId);
    if (firstId >= 0) {
        trackQueue.setCurrentTrack(firstId);
        return playCurrentTrack();
    }else {
        playNext();
        return true;
    }
}