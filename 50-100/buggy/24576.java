public void pause() {
    try {
        if (((mediaPlayer) != null) && (mediaPlayer.isPlaying())) {
            mediaPlayer.pause();
            isPaused = true;
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}