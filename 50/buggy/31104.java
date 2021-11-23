public java.lang.Long getNumberPhone() {
    android.telephony.TelephonyManager telephonyManager = ((android.telephony.TelephonyManager) (this.getSystemService(Context.TELEPHONY_SERVICE)));
    return java.lang.Long.valueOf(telephonyManager.getDeviceId());
}