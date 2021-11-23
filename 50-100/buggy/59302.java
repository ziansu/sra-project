@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((customPhoneStateListener) == null) {
        customPhoneStateListener = new com.vahn.cordova.phonestatedetection.CustomPhoneStateListener(context);
    }
    if ((telephonyManager) == null) {
        telephonyManager = ((android.telephony.TelephonyManager) (context.getSystemService(Context.TELEPHONY_SERVICE)));
    }
    telephonyManager.listen(customPhoneStateListener, PhoneStateListener.LISTEN_CALL_STATE);
}