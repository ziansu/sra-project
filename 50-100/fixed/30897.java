@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    playingURL = intent.getStringExtra(PlayerService.PLAYING_URL);
    if (parcelableTrack.previewURL.equals(playingURL)) {
        int currPosition = intent.getIntExtra(PlayerService.CURR_TRACK_POSITION, 0);
        mPlayerViewHolder.playButton.setImageResource(android.R.drawable.ic_media_pause);
        mPlayerViewHolder.seekBar.setProgress(currPosition);
        java.lang.String formattedDuration = new java.text.SimpleDateFormat("mm:ss").format(new java.util.Date(currPosition));
        mPlayerViewHolder.trackTimeTextView.setText(formattedDuration);
        playing = true;
    }
}