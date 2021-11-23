private void playNextSong() {
    stop();
    (nowPlayingPosition)++;
    nowPlaying = queue.get(nowPlayingPosition);
    loadSong(nowPlaying);
}