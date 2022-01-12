protected void performPlayPause() {
    if (isPlaying()) {
        performPause();
    }else {
        performPlay();
    }
}