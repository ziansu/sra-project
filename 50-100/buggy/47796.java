void observe() {
    android.content.ContentResolver resolver = mContext.getContentResolver();
    resolver.registerContentObserver(Settings.System.getUriFor(Settings.System.STATUS_BAR_QUICK_QS_PULLDOWN), false, this, UserHandle.USER_ALL);
    resolver.registerContentObserver(Settings.System.getUriFor(Settings.System.DOUBLE_TAP_SLEEP_GESTURE), resolver.registerContentObserver(Settings.Secure.getUriFor(Settings.Secure.STATUS_BAR_LOCKED_ON_SECURE_KEYGUARD), false, this, UserHandle.USER_ALL));
    update();
}