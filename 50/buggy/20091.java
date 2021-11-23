public void startObserving() {
    mContext.getContentResolver().registerContentObserver(Settings.System.getUriFor(Settings.System.DISPLAY_TEMPERATURE_MODE), false, this);
    mContext.getContentResolver().registerContentObserver(Settings.System.getUriFor(Settings.System.DISPLAY_TEMPERATURE_DAY), false, this);
}