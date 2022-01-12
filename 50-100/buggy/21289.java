private void updatePlayButton() {
    if (player_.isPlaying()) {
        playButton_.setContentDescription(getResources().getString(R.string.action_pause));
        playButton_.setImageResource(R.drawable.ic_pause_white_24dp);
    }else {
        playButton_.setContentDescription(getResources().getString(R.string.action_play));
        playButton_.setImageResource(R.drawable.ic_play_arrow_white_24dp);
    }
}