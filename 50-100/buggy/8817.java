@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) + 1) % (mStations.length);
    mStartStopButton.setImageDrawable(playDrawable());
    updateDropdownHeader(mCurrentIndex);
    playPressed = false;
    doneBuffering = false;
    if (player.isPlaying()) {
        player.stop();
    }
    player.release();
    setupPlayer();
    updateViews();
    clickPlayButton();
}