public float calcBattery(float init) {
    float batteryValue;
    int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, (-1));
    int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, (-1));
    batteryValue = init - (level / ((float) (10000)));
    if (batteryValue < 0)
        batteryValue *= -1;
    
    return batteryValue;
}