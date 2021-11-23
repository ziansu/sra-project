public com.sedmelluq.discord.lavaplayer.track.AudioTrack skipTrack() {
    replacePlayingSong();
    if ((_activePlaylist.indexOf(_playingSong)) < (_activePlaylist.size())) {
        return _activePlaylist.get(((_activePlaylist.indexOf(_playingSong)) + 1));
    }else {
        return _activePlaylist.get(0);
    }
}