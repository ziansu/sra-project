public void setSendInterval(long sendInterval) {
    android.content.SharedPreferences.Editor editor = mPrefs.edit();
    editor.putLong(com.ibm.pisdk.PIBeaconSensor.SEND_INTERVAL_KEY, sendInterval);
    editor.apply();
    android.content.Intent intent = new android.content.Intent(mContext, com.ibm.pisdk.PIBeaconSensorService.class);
    intent.putExtra(com.ibm.pisdk.PIBeaconSensor.SEND_INTERVAL_KEY, sendInterval);
    mContext.startService(intent);
}