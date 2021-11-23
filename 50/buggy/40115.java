@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.i(edu.ucla.nesl.wearcontext.MainActivity.TAG, "onResume() called");
    android.content.SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
    mAlarmSet = sharedPref.getBoolean(getString(R.string.alarm_set), false);
}