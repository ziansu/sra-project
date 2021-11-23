@java.lang.Override
protected void onPause() {
    super.onPause();
    com.crashlytics.android.Crashlytics.log(Log.DEBUG, TAG, "onPause");
}