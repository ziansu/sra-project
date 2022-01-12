@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    java.lang.String value = ((java.lang.String) (newValue));
    boolean isBlackList = (null != value) && (value.equals(PreferenceActivity.LIST_BLACK));
    appList.setTitle(activity.getString((isBlackList ? R.string.pref_update_list_black : R.string.pref_update_list_white)));
    preference.setSummary(activity.getString((isBlackList ? R.string.pref_update_list_white_or_black_black : R.string.pref_update_list_white_or_black_white)));
    return true;
}