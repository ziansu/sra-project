public void onClick(android.view.View sender) {
    if ((mStartPos) == 0) {
        onPlay(mStartPos);
    }else {
        onPlay(mWaveformView.getmPlaybackPos());
    }
    togglePlayButton();
}