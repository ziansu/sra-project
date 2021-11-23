@java.lang.Override
protected java.lang.String doInBackground(uk.co.spookypeanut.lovetag.Track... params) {
    mNewTrack = mLfs.getTrackInfo(params[0]);
    mOrigTrack = params[0];
    mOrigTrack.mLoved = mNewTrack.mLoved;
    return "";
}