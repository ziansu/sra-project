@java.lang.Override
void getMetricInfo() {
    if (DebugLog.DEBUG)
        android.util.Log.d(edu.nd.darts.cimon.SMSInfoService.TAG, "SMSInfoService.getMetricInfo - updating sms activity value");
    
    if ((prevSMSID) < 0) {
        if ((smsObserver) == null) {
            smsObserver = new edu.nd.darts.cimon.SMSInfoService.SmsContentObserver(metricHandler);
        }
        smsResolver.registerContentObserver(edu.nd.darts.cimon.SMSInfoService.uri, true, smsObserver);
        performUpdates();
    }
}