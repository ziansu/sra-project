private void nextTrack() {
    if ((mCurrentTrackIndex) == ((mAllTracks.size()) - 1)) {
        mCurrentTrackIndex = -1;
    }
    mCurrentTrackIndex = (mCurrentTrackIndex) + 1;
    mCurrentTrackDetails = ((com.udacity.neerajbholani.spotifystreamer.parcelables.TrackDetails) (mAllTracks.get(mCurrentTrackIndex)));
    updateViewsWithCurrentTrackDetails();
    playTrack();
}