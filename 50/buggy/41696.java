public void releasePlayer() {
    if ((player) != null) {
        if (player.isPlaying()) {
            player.stop();
        }
        player.reset();
        player.release();
        player = null;
    }
}