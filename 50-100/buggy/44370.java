public void update() {
    android.content.ContentResolver resolver = mContext.getContentResolver();
    mOneFingerQuickSettingsInterceptMode = Settings.System.getIntForUser(resolver, Settings.System.STATUS_BAR_QUICK_QS_PULLDOWN, com.android.systemui.statusbar.phone.NotificationPanelView.ONE_FINGER_QS_INTERCEPT_END, UserHandle.USER_CURRENT);
    mDoubleTapToSleepEnabled = (Settings.System.getInt(resolver, Settings.System.DOUBLE_TAP_SLEEP_GESTURE, 0)) == 1;
    mStatusBarLockedOnSecureKeyguard = (Settings.Secure.getIntForUser(resolver, Settings.Secure.STATUS_BAR_LOCKED_ON_SECURE_KEYGUARD, 1, UserHandle.USER_CURRENT)) == 1;
}