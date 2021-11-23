@java.lang.Override
public void onNext(io.nya.powerlyrics.model.Track track) {
    if ((mCurrentTrack.id) == (track.id)) {
        mCurrentTrack = track;
        mApp.mCurrentTrackSubject.onNext(track);
    }
    if ((mPlayStatus.status) == (PowerampAPI.Status.TRACK_PLAYING)) {
        createNotification();
    }
}