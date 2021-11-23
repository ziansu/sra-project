private void handleEnterEmergencyCallbackMode(android.os.Message msg) {
    if (com.android.internal.telephony.cdma.CDMAPhone.DBG) {
        android.telephony.Rlog.d(com.android.internal.telephony.cdma.CDMAPhone.LOG_TAG, ("handleEnterEmergencyCallbackMode,mIsPhoneInEcmState= " + (mIsPhoneInEcmState)));
    }
    if ((mIsPhoneInEcmState) == false) {
        mIsPhoneInEcmState = true;
        sendEmergencyCallbackModeChange();
        super.setSystemProperty(TelephonyProperties.PROPERTY_INECM_MODE, "true");
        long delayInMillis = android.os.SystemProperties.getLong(TelephonyProperties.PROPERTY_ECM_EXIT_TIMER, com.android.internal.telephony.cdma.CDMAPhone.DEFAULT_ECM_EXIT_TIMER_VALUE);
        postDelayed(mExitEcmRunnable, delayInMillis);
        mWakeLock.acquire();
    }
}