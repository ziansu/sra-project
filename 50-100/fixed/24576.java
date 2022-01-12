public void pause() {
    isPaused = true;
    try {
        if (((mediaPlayer) != null) && (mediaPlayer.isPlaying())) {
            mediaPlayer.pause();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}