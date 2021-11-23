@java.lang.Override
public void onCallDisconnected(final org.pjsip.pjsua2.Call call) {
    try {
        mSipAccount.setRegistration(false);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    if ((!(mUserHangupCall)) && (mCallIsConnected)) {
        mToneGenerator.startTone(ToneGenerator.TONE_CDMA_NETWORK_BUSY, 1500);
    }
    setCurrentCall(null);
    if (com.voipgrid.vialer.util.PhonePermission.hasPermission(getApplicationContext())) {
        unregisterReceiver(mGsmCallListener);
    }
    broadcast(SipConstants.CALL_DISCONNECTED_MESSAGE);
    stopSelf();
}