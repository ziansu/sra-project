public void downloadMessage(java.lang.String locationUrl, android.app.PendingIntent downloadedIntent) {
    if (android.text.TextUtils.isEmpty(locationUrl)) {
        throw new java.lang.IllegalArgumentException("Empty MMS location URL");
    }
    try {
        final com.android.internal.telephony.mms.IMms iMms = IMms.Stub.asInterface(android.os.ServiceManager.getService(android.telephony.MmsManager.SERVICE));
        if (iMms == null) {
            android.util.Log.e(android.telephony.MmsManager.LOG_TAG, "Can not find Mms service");
            return ;
        }
        iMms.downloadMessage(locationUrl, downloadedIntent);
    } catch (android.os.RemoteException e) {
    }
}