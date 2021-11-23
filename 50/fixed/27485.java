int LAC() {
    return ((android.telephony.gsm.GsmCellLocation) (((android.telephony.TelephonyManager) (c.getSystemService(Context.TELEPHONY_SERVICE))).getCellLocation())).getLac();
}