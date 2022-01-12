private synchronized boolean playPlaylist(int playListId, int firstId) {
    if (!(trackQueue.setPlaylist(playListId))) {
        return false;
    }
    if (firstId >= 0) {
        trackQueue.setCurrentTrack(firstId);
        return playCurrentTrack();
    }else {
        playNext();
        return true;
    }
}