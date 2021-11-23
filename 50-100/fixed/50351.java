public void run() {
    if (mPlayer.getCycleDuration().lessThanOrEqualTo(mPlayer.getCurrentTime())) {
        mPlayer.seek(mPlayer.getStartTime());
    }
    mPlayer.play();
    if (shouldLoop) {
        mPlayer.setCycleCount(javafx.scene.media.MediaPlayer.INDEFINITE);
    }
}