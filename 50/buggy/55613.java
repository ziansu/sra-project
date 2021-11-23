@java.lang.Override
protected void onResume() {
    super.onResume();
    startMediaUploadService();
    startMediaDeleteService(null);
    org.wordpress.android.ui.ActivityId.trackLastActivity(ActivityId.MEDIA);
}