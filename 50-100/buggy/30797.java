private void stopRecordingPlayback() {
    if ((mPlayer) != null) {
        mPlayer.stop();
        mPlayer.release();
        mPlayer = null;
    }
    if ((mPlaybackHandler) != null) {
        mPlaybackHandler.removeCallbacks(updatePreviewStatus);
        mPlaybackHandler = null;
        mPlaybackTimerCount = 0;
    }
    changeToNotRecordingUIState();
}