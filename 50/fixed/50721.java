public void seek(double newTime) {
    if ((player) != null) {
        player.seek(currentSongDuration.multiply((newTime / 100.0)));
    }
}