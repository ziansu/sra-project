@java.lang.Override
public void onStop() {
    super.onStart();
    int sessionLengthSeconds = ((int) (((java.lang.System.currentTimeMillis()) - (sessionStartTime)) / 1000));
    com.google.android.stardroid.activities.DynamicStarMapActivity.SessionBucketLength bucket = getSessionLengthBucket(sessionLengthSeconds);
    com.google.android.stardroid.util.Analytics.getInstance(this).trackEvent(Analytics.GENERAL_CATEGORY, Analytics.SESSION_LENGTH_BUCKET, bucket.toString(), sessionLengthSeconds);
}