public void onClick(android.view.View sender) {
    if ((mPlayStartMsec) == 0) {
        onPlay(mStartPos);
    }else {
        onPlay(mWaveformView.getmPlaybackPos());
    }
    togglePlayButton();
}