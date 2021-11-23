public float GetBatteryPct(android.content.Context context) {
    android.content.Intent batteryStatus = GetBatteryStatusIntent();
    int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, (-1));
    int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, (-1));
    float batteryPct = level / ((float) (scale));
    return batteryPct;
}