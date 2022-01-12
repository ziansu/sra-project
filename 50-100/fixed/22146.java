protected synchronized boolean isUpToDate() {
    final java.util.Date mpdlast = mMPD.getStatistics().getDBUpdateTime();
    android.util.Log.d(com.namelessdev.mpdroid.helpers.AlbumCache.TAG, ((("lastupdate " + (mLastUpdate)) + " mpd date ") + mpdlast));
    return ((null != (mLastUpdate)) && (null != mpdlast)) && ((mLastUpdate.equals(mpdlast)) || (mLastUpdate.after(mpdlast)));
}