public void cleanupMediaPlayerResources() {
    if ((mediaController) != null) {
        mediaController.hide();
    }
    if ((mMediaPlayer) != null) {
        mMediaPlayerValid = false;
        release();
    }
}