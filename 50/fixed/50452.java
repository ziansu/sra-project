private void handlePlaybackButtonClick() {
    if ((!(mPlayback)) || ((mStationID) != (mStationIDCurrent))) {
        startPlayback();
    }else {
        stopPlayback();
    }
}