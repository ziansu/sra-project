private int getPhoneTypeFromProperty(int phoneId) {
    java.lang.String type = android.telephony.TelephonyManager.getTelephonyProperty(phoneId, TelephonyProperties.CURRENT_ACTIVE_PHONE, null);
    if ((type == null) || (type.isEmpty())) {
        return getPhoneTypeFromNetworkType(phoneId);
    }
    return java.lang.Integer.parseInt(type);
}