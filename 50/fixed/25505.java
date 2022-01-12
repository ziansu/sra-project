@java.lang.Override
public void onReceive(android.content.Context arg0, android.content.Intent arg1) {
    if ((smsServiceListener) != null)
        smsServiceListener.OnSmsSent(sms, getResultCode());
    
}