@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    if (preference == (mOnTheGoAlphaPref)) {
        float val = java.lang.Float.parseFloat(((java.lang.String) (newValue)));
        Settings.System.putFloat(mCr, Settings.System.ON_THE_GO_ALPHA, (val / 100));
        return true;
    }else
        if (preference == (mScreenshotDelay)) {
            int value = java.lang.Integer.parseInt(newValue.toString());
            Settings.System.putInt(mCr, Settings.System.SCREENSHOT_DELAY, value);
            return true;
        }
    
    return false;
}