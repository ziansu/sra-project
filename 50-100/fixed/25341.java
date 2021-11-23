static boolean phoneIsCdma(int subId) {
    boolean isCdma = false;
    try {
        com.android.internal.telephony.ITelephony phone = ITelephony.Stub.asInterface(android.os.ServiceManager.checkService("phone"));
        if (phone != null) {
            isCdma = (phone.getActivePhoneTypeForSubscriber(subId)) == (android.telephony.TelephonyManager.PHONE_TYPE_CDMA);
        }
    } catch (android.os.RemoteException e) {
        android.util.Log.w(com.android.cellbroadcastreceiver.CellBroadcastReceiver.TAG, "phone.getActivePhoneType() failed", e);
    }
    return isCdma;
}