private void playPrevTrack() {
    if ((mSelectedTrack) > 0) {
        handleCancellableFuturesCallable.cancelCurrFuture();
        --(mSelectedTrack);
        eventBus.post(new au.com.kbrsolutions.spotifystreamer.events.PlayerControllerUiEvents.Builder(PlayerControllerUiEvents.PlayerUiEvents.PREPARING_NEXT_TRACK).setSselectedTrack(mSelectedTrack).setPlayingFirstTrack(((mSelectedTrack) == 0)).build());
        playTrack(mTracksDetails.get(mSelectedTrack));
    }
}