public void pauseMedia() {
    if (playerTrack1.isPlaying()) {
        playerTrack1.pause();
    }
    if (playerTrack2.isPlaying()) {
        playerTrack2.stop();
    }
    if (playerTrack3.isPlaying()) {
        playerTrack3.stop();
    }
    if (playerTrack4.isPlaying()) {
        playerTrack4.stop();
    }
}