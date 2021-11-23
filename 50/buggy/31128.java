public void play() {
    if (player.isPaused()) {
        player.setPaused(false);
    }
    if ((player.getPlayingTrack()) == null) {
        play0();
    }
}