public void setBackgroundScanPeriod(long scanPeriod) {
    android.content.SharedPreferences.Editor editor = mPrefs.edit();
    editor.putLong(com.ibm.pisdk.PIBeaconSensor.SEND_INTERVAL_KEY, scanPeriod);
    editor.apply();
    android.content.Intent intent = new android.content.Intent(mContext, com.ibm.pisdk.PIBeaconSensorService.class);
    intent.putExtra(com.ibm.pisdk.PIBeaconSensor.BACKGROUND_SCAN_PERIOD_KEY, scanPeriod);
    mContext.startService(intent);
}