@java.lang.Override
public void onCallStateChanged(int state, java.lang.String incomingNumber) {
    java.lang.String callState = "UNKNOWN";
    switch (state) {
        case android.telephony.TelephonyManager.CALL_STATE_IDLE :
            break;
        case android.telephony.TelephonyManager.CALL_STATE_RINGING :
            _phoneNumberLocalPersistence.saveLastPhoneNumber(incomingNumber, _context);
            checkAndAlertBlacklistedPhoneNumber(incomingNumber);
            break;
        case android.telephony.TelephonyManager.CALL_STATE_OFFHOOK :
            break;
    }
    super.onCallStateChanged(state, incomingNumber);
}