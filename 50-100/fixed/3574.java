private void startStopClicked() {
    if (isPlaying) {
        mMusicPlayerService.pause();
    }else {
        if (mPlayClickedAtLeastOnceForCurrArtist) {
            mMusicPlayerService.resume();
        }else {
            mMusicPlayerService.playTrack(tracksDetails.get(mSelectedTrack));
        }
    }
    isPlaying = !(isPlaying);
    mPlayClickedAtLeastOnceForCurrArtist = true;
}