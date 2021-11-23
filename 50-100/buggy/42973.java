void observe() {
    android.content.ContentResolver resolver = mContext.getContentResolver();
    resolver.registerContentObserver(Settings.System.getUriFor(Settings.System.STATUS_BAR_QUICK_QS_PULLDOWN), false, this);
    resolver.registerContentObserver(Settings.System.getUriFor(Settings.System.DOUBLE_TAP_SLEEP_GESTURE), false, this);
    resolver.registerContentObserver(Settings.System.getUriFor(Settings.System.DOUBLE_TAP_SLEEP_ANYWHERE), false, this, UserHandle.USER_ALL);
    update();
}