private void findAndUpdateTrack(android.content.Intent intent) {
    android.os.Bundle trackBundle = intent.getBundleExtra(PowerampAPI.TRACK);
    if (trackBundle != null) {
        io.nya.powerlyrics.model.Track track = createTrack(trackBundle);
        if (((mCurrentTrack) == null) || (((track.id) != (mCurrentTrack.id)) && ((track.realId) != (mCurrentTrack.realId)))) {
            mCurrentTrack = track;
            mApp.mCurrentTrackSubject.onNext(mCurrentTrack);
            searchTrackLyric(track);
        }
    }
}