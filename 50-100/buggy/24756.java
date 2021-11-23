public void pauseMedia() {
    if ((playerTrack1.isPlaying()) == true) {
        playerTrack1.pause();
    }
    if ((playerTrack2.isPlaying()) == true) {
        playerTrack2.stop();
    }
    if ((playerTrack3.isPlaying()) == true) {
        playerTrack3.stop();
    }
    if ((playerTrack4.isPlaying()) == true) {
        playerTrack4.stop();
    }
}