void observe() {
    android.content.ContentResolver resolver = mContext.getContentResolver();
    resolver.registerContentObserver(CMSettings.System.getUriFor(CMSettings.System.STATUS_BAR_QUICK_QS_PULLDOWN), false, this);
    resolver.registerContentObserver(CMSettings.System.getUriFor(CMSettings.System.DOUBLE_TAP_SLEEP_GESTURE), false, this);
    resolver.registerContentObserver(CMSettings.Secure.getUriFor(CMSettings.Secure.LOCK_SCREEN_WEATHER_ENABLED), false, this);
    resolver.registerContentObserver(Settings.System.getUriFor(Settings.System.QS_TRANSPARENT_SHADE), false, this, UserHandle.USER_ALL);
    update();
}