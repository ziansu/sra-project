public void addBeaconLayout(java.lang.String beaconLayout) {
    if (mState.equals(com.ibm.pisdk.PIBeaconSensor.STOPPED)) {
        android.content.SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString(com.ibm.pisdk.PIBeaconSensor.BEACON_LAYOUT_KEY, beaconLayout);
        editor.apply();
        android.content.Intent intent = new android.content.Intent(mContext, com.ibm.pisdk.PIBeaconSensorService.class);
        intent.putExtra(com.ibm.pisdk.PIBeaconSensor.BEACON_LAYOUT_KEY, beaconLayout);
        mContext.startService(intent);
    }else {
        com.ibm.pisdk.PILogger.e(com.ibm.pisdk.PIBeaconSensor.TAG, "Cannot set beacon layout while service is running.");
    }
}