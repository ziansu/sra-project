@java.lang.Override
public boolean canSwipe() {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    return sp.getBoolean(getString(R.string.sp_omnibox_control), true);
}