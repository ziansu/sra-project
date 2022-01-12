private void playLoop() {
    if ((soundCount) != null) {
        soundCount.stop();
    }
    mediaPlayer.stop();
    try {
        mediaPlayer.prepare();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    mediaPlayer.seekTo(((int) (bmLoopStart.getSeekTime())));
    mediaPlayer.start();
}