public void onCallStateChanged(int state, java.lang.String incomingNumber) {
    switch (state) {
        case android.telephony.TelephonyManager.CALL_STATE_IDLE :
            break;
        case android.telephony.TelephonyManager.CALL_STATE_OFFHOOK :
        case android.telephony.TelephonyManager.CALL_STATE_RINGING :
            try {
                org.stjude.www.dsassetmanagement.dsassetmanagement.RcpApi.close();
                open.setChecked(false);
                java.lang.System.out.println("calling stop............");
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            break;
    }
}