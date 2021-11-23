public void update() {
    android.content.ContentResolver resolver = mContext.getContentResolver();
    mOneFingerQuickSettingsIntercept = (Settings.System.getInt(resolver, Settings.System.STATUS_BAR_QUICK_QS_PULLDOWN, 1)) == 1;
    mDoubleTapToSleepEnabled = (Settings.System.getInt(resolver, Settings.System.DOUBLE_TAP_SLEEP_GESTURE, 1)) == 1;
    mStatusBarLockedOnSecureKeyguard = (Settings.Secure.getIntForUser(resolver, Settings.Secure.STATUS_BAR_LOCKED_ON_SECURE_KEYGUARD, 1, UserHandle.USER_CURRENT)) == 1;
}