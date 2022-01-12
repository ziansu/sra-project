@java.lang.Override
public void onPause() {
    super.onPause();
    if (!(fullColorStarted)) {
        com.engstuff.coloriphornia.helpers.PrefsHelper.writeToPrefs(this, Cv.PREFS_RETAIN, Cv.LAST_COLOR_BOX_1, fragmentColorBox.getHexColorParams());
        com.engstuff.coloriphornia.helpers.PrefsHelper.writeToPrefs(this, Cv.PREFS_RETAIN, Cv.LAST_COLOR_BOX_2, fragmentColorBox2.getHexColorParams());
    }
    unlockInfo = false;
}