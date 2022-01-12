@java.lang.Override
public void run() {
    if ((mLastUpdated) == null) {
        return ;
    }
    if ((getSupportActionBar()) == null) {
        return ;
    }
    getSupportActionBar().setSubtitle(getString(R.string.last_updated, android.text.format.DateUtils.getRelativeTimeSpanString(mLastUpdated, java.lang.System.currentTimeMillis(), DateUtils.MINUTE_IN_MILLIS, DateUtils.FORMAT_ABBREV_ALL)));
    mHandler.postAtTime(this, ((android.os.SystemClock.uptimeMillis()) + (android.text.format.DateUtils.MINUTE_IN_MILLIS)));
}