public void updateBatteryviews() {
    mBatteryMeterView = ((com.android.systemui.BatteryMeterView) (findViewById(R.id.battery)));
    int mBatteryIconColor = Settings.System.getInt(mContext.getContentResolver(), Settings.System.BATTERY_ICON_COLOR, -1);
    mColorSwitch = (Settings.System.getInt(mContext.getContentResolver(), Settings.System.STATUSBAR_COLOR_SWITCH, 0)) == 1;
    if (mColorSwitch) {
        mBatteryMeterView.setDarkIntensity(mBatteryIconColor);
    }
}