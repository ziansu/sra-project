private void previousTrack() {
    if ((mCurrentTrackIndex) == 0) {
        mCurrentTrackIndex = mAllTracks.size();
    }
    mCurrentTrackIndex = (mCurrentTrackIndex) - 1;
    mCurrentTrackDetails = ((com.udacity.neerajbholani.spotifystreamer.parcelables.TrackDetails) (mAllTracks.get(mCurrentTrackIndex)));
    updateViewsWithCurrentTrackDetails();
    playTrack();
}