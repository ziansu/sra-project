public void navigateTo(final java.lang.Class<? extends android.app.Activity> activityClass) {
    org.hisp.dhis.client.sdk.ui.utils.Preconditions.isNull(activityClass, "Target activity must not be null");
    android.content.Intent intent = new android.content.Intent(this, activityClass);
    overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);
    android.support.v4.app.ActivityCompat.startActivity(this, intent, null);
    finish();
}