private void playLoop() {
    mediaPlayer.stop();
    try {
        mediaPlayer.prepare();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    mediaPlayer.seekTo(((int) (bmLoopStart.getSeekTime())));
    mediaPlayer.start();
}