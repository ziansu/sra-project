private synchronized void applyPlaybackParamsNext() {
    if (isNextPlayingSameAlbum()) {
        applyPlaybackParams(nextMediaPlayer);
    }
}