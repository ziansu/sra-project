@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    if (preference == (mScreenshotDelay)) {
        int value = java.lang.Integer.parseInt(newValue.toString());
        Settings.System.putInt(mCr, Settings.System.SCREENSHOT_DELAY, value);
        return true;
    }
    return false;
}