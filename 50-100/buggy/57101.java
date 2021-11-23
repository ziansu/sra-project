public final void readPollPreferences(android.app.Activity activity) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(activity);
    mThreshold = prefs.getInt("threshold", 3);
    android.util.Log.i(AntiSnoringActivity.TAG, ("threshold=" + (mThreshold)));
    mPollDelay = java.lang.Integer.parseInt(prefs.getString("sleep", "5"));
    android.util.Log.i(AntiSnoringActivity.TAG, ("sleep=" + (mPollDelay)));
}