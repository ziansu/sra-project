private boolean isCorrectSimCard() {
    if (!(prefs.getString(AppProperties.SIMCARD, "").isEmpty())) {
        android.telephony.TelephonyManager tMgr = ((android.telephony.TelephonyManager) (getSystemService(com.labs.dm.auto_tethering.service.TELEPHONY_SERVICE)));
        java.lang.String simCard = tMgr.getSimSerialNumber();
        return (simCard != null) && (prefs.getString(AppProperties.SIMCARD, "").equals(simCard));
    }else {
        return true;
    }
}