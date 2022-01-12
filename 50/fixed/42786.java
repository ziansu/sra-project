private void play() {
    mPlaying = true;
    playButton.setImageResource(android.R.drawable.ic_media_pause);
    mMediaPlayer.start();
    mSeekBarHandler.postDelayed(updateSeekBar, 100);
}