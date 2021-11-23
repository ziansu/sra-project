@java.lang.Override
protected void onResume() {
    super.onResume();
    com.facebook.appevents.AppEventsLogger.activateApp(getApplication());
}