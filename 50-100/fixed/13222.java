private void queue(com.sedmelluq.discord.lavaplayer.track.AudioTrack track) {
    if (!(_tracks.contains(track))) {
        if ((_player.getPlayingTrack()) == null) {
            _player.playTrack(track);
            _tracks.add(track);
            _currentlyPlayingTrack = track;
        }else {
            _tracks.add(track);
        }
    }
}