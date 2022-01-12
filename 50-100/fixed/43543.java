public static int getSimStateForSlotIdx(int slotIdx) {
    int simState = TelephonyManager.SIM_STATE_UNKNOWN;
    try {
        com.android.internal.telephony.ISub iSub = ISub.Stub.asInterface(android.os.ServiceManager.getService("isub"));
        if (iSub != null) {
            simState = iSub.getSimStateForSlotIdx(slotIdx);
        }
    } catch (android.os.RemoteException ex) {
    }
    android.telephony.SubscriptionManager.logd(((("getSimStateForSubscriber: simState=" + simState) + " slotIdx=") + slotIdx));
    return simState;
}