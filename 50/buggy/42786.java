private void play(android.widget.ImageButton playButton) {
    mPlaying = true;
    playButton.setImageResource(android.R.drawable.ic_media_pause);
    mMediaPlayer.start();
    mSeekBarHandler.postDelayed(updateSeekBar, 100);
}