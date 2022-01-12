public void addBeaconLayout(java.lang.String beaconLayout) {
    mPrefs.edit().putString(com.ibm.pisdk.PIBeaconSensor.BEACON_LAYOUT_KEY, beaconLayout).apply();
    android.content.Intent intent = new android.content.Intent(mContext, com.ibm.pisdk.PIBeaconSensorService.class);
    intent.putExtra(com.ibm.pisdk.PIBeaconSensor.BEACON_LAYOUT_KEY, beaconLayout);
    mContext.startService(intent);
}