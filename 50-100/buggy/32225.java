@java.lang.Override
protected void onResume() {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    if (prefs.getBoolean("showVersionMismatchDialog", true)) {
        android.content.SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("showVersionMismatchDialog", false).commit();
        me.johannesnz.smsim.Main.showVersionMismatchDialog(this);
    }
    super.onResume();
}