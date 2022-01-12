int MCC() {
    java.lang.String networkOperator = ((android.telephony.TelephonyManager) (getSystemService(Context.TELEPHONY_SERVICE))).getNetworkOperator();
    return !(android.text.TextUtils.isEmpty(networkOperator)) ? java.lang.Integer.parseInt(networkOperator.substring(0, 3)) : 0;
}