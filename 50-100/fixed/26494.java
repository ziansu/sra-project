@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    boolean checked = false;
    if (newValue instanceof java.lang.Boolean) {
        checked = java.lang.Boolean.TRUE.equals(newValue);
    }
    switch (preference.getTitleRes()) {
        case R.string.no_track :
            peter.util.searcher.SettingsManager.getInstance().saveNoTrackSp(checked);
            return true;
    }
    return false;
}