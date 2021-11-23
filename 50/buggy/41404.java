public java.lang.String getBatteryLevel() {
    return mSharedPreferences.getString("battery_level", "n/a");
}