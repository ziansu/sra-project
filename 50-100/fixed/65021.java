@java.lang.Override
public void onNext(java.lang.String s) {
    android.util.Log.d(io.nya.powerlyrics.service.PlayService.LOG_TAG, ("lyric is: " + s));
    mCurrentLyric = s;
    mApp.mCurrentLyricSubject.onNext(s);
    mApp.mSearchStateSubject.onNext(Constants.SearchState.STATE_COMPLETE);
    if ((mPlayStatus) == (PowerampAPI.Status.TRACK_PLAYING)) {
        createNotification();
    }
}