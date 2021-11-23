private void pause(android.widget.ImageButton playButton) {
    mPlaying = false;
    playButton.setImageResource(android.R.drawable.ic_media_play);
    if (mMediaPlayer.isPlaying()) {
        mMediaPlayer.pause();
    }
}