@java.lang.Override
public void onReceive(android.content.Context arg0, android.content.Intent arg1) {
    java.lang.String status = null;
    switch (this.getResultCode()) {
        case android.app.Activity.RESULT_OK :
            status = "SMS sent";
            break;
        case android.telephony.SmsManager.RESULT_ERROR_GENERIC_FAILURE :
            status = "Generic failure";
            break;
        case android.telephony.SmsManager.RESULT_ERROR_NO_SERVICE :
            status = "No service";
            break;
        case android.telephony.SmsManager.RESULT_ERROR_NULL_PDU :
            status = "Null PDU";
            break;
        case android.telephony.SmsManager.RESULT_ERROR_RADIO_OFF :
            status = "Radio off";
            break;
    }
    if (sendSMSCallback != null) {
        sendSMSCallback.onSMSSent(status);
    }
}