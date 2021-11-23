boolean setPlaylist(int id) {
    if (id == (-1)) {
        basePlaylist = null;
        setTrackList(com.awaker.data.MediaManager.getAllTracks());
        return true;
    }else {
        com.awaker.audio.PlayList playlist = com.awaker.data.MediaManager.getPlayList(id);
        if ((playlist.getTracks().size()) > 0) {
            basePlaylist = playlist;
            setTrackList(playlist.getTracks());
            return true;
        }
    }
    return false;
}