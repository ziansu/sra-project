public void stopBgm() {
    if (bgmPlayer.isPlaying()) {
        bgmPlayer.stop();
    }
    bgmPlayer = null;
}