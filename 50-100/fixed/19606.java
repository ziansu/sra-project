public void update() {
    android.content.ContentResolver resolver = mContext.getContentResolver();
    mOneFingerQuickSettingsIntercept = (Settings.System.getInt(resolver, Settings.System.STATUS_BAR_QUICK_QS_PULLDOWN, 1)) == 1;
    mDoubleTapToSleepEnabled = (Settings.System.getInt(resolver, Settings.System.DOUBLE_TAP_SLEEP_GESTURE, 1)) == 1;
    mDoubleTapToSleepAnywhere = (Settings.System.getInt(resolver, Settings.System.DOUBLE_TAP_SLEEP_ANYWHERE, 0)) == 1;
}