public void setPlayPauseButtonState(int state) {
    switch (state) {
        case com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment.PlayerControlsPopupWindow.PlayPauseButtonState.PLAY :
            playPauseButton.setImageResource(R.drawable.play_24dp);
            break;
        case com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment.PlayerControlsPopupWindow.PlayPauseButtonState.PAUSE :
            playPauseButton.setImageResource(R.drawable.pause_24dp);
            break;
        case com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment.PlayerControlsPopupWindow.PlayPauseButtonState.REPLAY :
            playPauseButton.setImageResource(R.drawable.replay_24dp);
            break;
        default :
            logWrapper.w(com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment.TAG, "Value passed into setPlayPauseButtonState was not a valid state constant. Value passed in: %d", state);
            break;
    }
    playPauseButtonState = state;
}