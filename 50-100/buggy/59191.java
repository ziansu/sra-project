@java.lang.Override
public void onResume() {
    super.onResume();
    configureBucketAndAdapter();
    refreshNotes();
    if ((mBucket) != null) {
        mBucket.addListener(this);
    }
    new java.lang.Thread(new java.lang.Runnable() {
        public void run() {
            org.wordpress.android.GCMMessageService.removeAllNotifications(getActivity());
        }
    }).start();
    if (org.wordpress.android.ui.notifications.utils.SimperiumUtils.isUserAuthorized()) {
        org.wordpress.android.ui.notifications.utils.SimperiumUtils.startBuckets();
        org.wordpress.android.util.AppLog.i(AppLog.T.NOTIFS, "Starting Simperium buckets");
    }
}