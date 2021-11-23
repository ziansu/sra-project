@java.lang.Override
protected void onResume() {
    super.onResume();
    com.crashlytics.android.Crashlytics.log(Log.DEBUG, TAG, "onResume");
    com.crashlytics.android.Crashlytics.setString("screen", TAG);
}