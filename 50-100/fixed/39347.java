private void updateAll() {
    if ((mPlayerService) != null) {
        updateQueue();
        updateTrackInfo();
        setButtonDrawable();
        if (org.oucho.musicplayer.PlayerService.isPlaying()) {
            mHandler.post(mUpdateSeekBarRunnable);
        }
        updateShuffleButton();
        updateRepeatButton();
    }
}