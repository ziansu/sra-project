private void startStopClicked() {
    if (isPlaying) {
        playPause.setBackground(getActivity().getResources().getDrawable(R.drawable.ic_action_play));
        mMusicPlayerService.pause();
    }else {
        playPause.setBackground(getActivity().getResources().getDrawable(R.drawable.ic_action_pause));
        if (mPlayClickedAtLeastOnceForCurrArtist) {
            mMusicPlayerService.resume();
        }else {
            mMusicPlayerService.playTrack(tracksDetails.get(mSelectedTrack));
        }
    }
    isPlaying = !(isPlaying);
    mPlayClickedAtLeastOnceForCurrArtist = true;
}