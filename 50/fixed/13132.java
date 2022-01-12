private void resetMediaPlayer() {
    if ((mMediaPlayer) != null) {
        if (mMediaPlayer.isPlaying()) {
            mMediaPlayer.stop();
        }
        mMediaPlayer = new android.media.MediaPlayer();
    }
}