void setPlaylist(int id) {
    if (id == (-1)) {
        basePlaylist = null;
        setTrackList(com.awaker.data.MediaManager.getAllTracks());
    }else {
        com.awaker.audio.PlayList playlist = com.awaker.data.MediaManager.getPlayList(id);
        basePlaylist = playlist;
        setTrackList(playlist.getTracks());
    }
}