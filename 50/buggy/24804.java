private void loadShowBatteryTextSetting() {
    android.content.ContentResolver resolver = getContext().getContentResolver();
    mShowBatteryText = 0 != (Settings.System.getInt(resolver, Settings.System.STATUS_BAR_SHOW_BATTERY_PERCENT, 0));
}