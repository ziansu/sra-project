@java.lang.Override
public void onResume() {
    super.onResume();
    configureBucketAndAdapter();
    refreshNotes();
    if ((mBucket) != null) {
        mBucket.addListener(this);
    }
    if (org.wordpress.android.ui.notifications.utils.SimperiumUtils.isUserAuthorized()) {
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.startBuckets();
        org.wordpress.android.util.AppLog.i(AppLog.T.NOTIFS, "Starting Simperium buckets");
    }
}