public void restoreState() {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    regNum = prefs.getString("regNum", "");
    appStatus = prefs.getInt("status", com.nordman.big.smsparking2.SmsManager.STATUS_INITIAL);
    sendDate = new java.util.Date(prefs.getLong("sendDate", 0));
    startParkingDate = new java.util.Date(prefs.getLong("startParkingDate", 0));
    currentZone = geoMgr.getParkZone(prefs.getInt("zoneNumber", 0));
}