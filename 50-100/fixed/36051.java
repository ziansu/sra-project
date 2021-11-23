public void setSendInterval(long sendInterval) {
    mPrefs.edit().putLong(com.ibm.pisdk.PIBeaconSensor.SEND_INTERVAL_KEY, sendInterval).apply();
    android.content.Intent intent = new android.content.Intent(mContext, com.ibm.pisdk.PIBeaconSensorService.class);
    intent.putExtra(com.ibm.pisdk.PIBeaconSensor.SEND_INTERVAL_KEY, sendInterval);
    mContext.startService(intent);
}