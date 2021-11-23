public void resumeBackgroundMusic() {
    if ((bgMediaPlayer.isPlaying()) == false) {
        bgMediaPlayer.seekTo(bgPos);
        bgMediaPlayer.start();
    }
}