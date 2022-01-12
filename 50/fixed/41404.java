public int getBatteryLevel() {
    return mSharedPreferences.getInt("battery_level", (-1));
}