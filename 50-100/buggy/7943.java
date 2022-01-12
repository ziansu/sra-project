public com.sedmelluq.discord.lavaplayer.track.AudioTrack getNext() {
    if ((_playingSong) == null) {
        _playingSong = _activePlaylist.get(0);
        return _playingSong;
    }
    replacePlayingSong();
    _playingSong = _activePlaylist.get(((_activePlaylist.indexOf(_playingSong)) + 1));
    return _playingSong;
}