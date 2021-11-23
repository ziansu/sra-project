public static int getSimStateForSlotIdx(int slotIdx) {
    int simState;
    try {
        com.android.internal.telephony.ISub iSub = ISub.Stub.asInterface(android.os.ServiceManager.getService("isub"));
        simState = iSub.getSimStateForSlotIdx(slotIdx);
    } catch (android.os.RemoteException ex) {
        simState = TelephonyManager.SIM_STATE_UNKNOWN;
    }
    android.telephony.SubscriptionManager.logd(((("getSimStateForSubscriber: simState=" + simState) + " slotIdx=") + slotIdx));
    return simState;
}