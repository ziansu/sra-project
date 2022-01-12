public com.sedmelluq.discord.lavaplayer.track.AudioTrack skipTrack() {
    replacePlayingSong();
    if ((_activePlaylist.indexOf(_playingSong)) < (_activePlaylist.size())) {
        _playingSong = _activePlaylist.get(((_activePlaylist.indexOf(_playingSong)) + 1));
        return _playingSong;
    }else {
        _playingSong = _activePlaylist.get(0);
        return _playingSong;
    }
}