void restartSong() {
    replaceTrack(_player.getPlayingTrack());
    _player.startTrack(_currentlyPlayingTrack, false);
}