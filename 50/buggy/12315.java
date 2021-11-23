@java.lang.Override
protected void onResume() {
    super.onResume();
    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    displayTimeRemaining();
    com.exacttarget.etpushsdk.ETAnalytics.trackPageView(com.example.helloworld.ui.activities.MainActivity.class.getCanonicalName());
}