@java.lang.Override
protected void onStop() {
    android.util.Log.v(ca.rmen.android.frccommon.prefs.FRCPreferenceActivity.TAG, "onStop");
    android.preference.PreferenceManager.getDefaultSharedPreferences(this).unregisterOnSharedPreferenceChangeListener(mOnSharedPreferenceChangeListener);
    android.preference.PreferenceManager.getDefaultSharedPreferences(this).unregisterOnSharedPreferenceChangeListener(mSystemNotificationPreferenceListener);
    ca.rmen.android.frcwidget.FRCWidgetScheduler.getInstance(this).schedule(this);
    super.onStop();
}