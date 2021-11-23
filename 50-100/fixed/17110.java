public void setDefaultDataSubId(int subId) {
    if (subId == (android.telephony.SubscriptionManager.DEFAULT_SUBSCRIPTION_ID)) {
        throw new java.lang.RuntimeException("setDefaultDataSubId called with DEFAULT_SUB_ID");
    }
    if (com.android.internal.telephony.SubscriptionController.DBG)
        logdl(("[setDefaultDataSubId] subId=" + subId));
    
    if ((mDctController) == null) {
        mDctController = com.android.internal.telephony.dataconnection.DctController.getInstance();
        mDctController.registerForDefaultDataSwitchInfo(mDataConnectionHandler, com.android.internal.telephony.SubscriptionController.EVENT_SET_DEFAULT_DATA_DONE, null);
    }
    mDctController.setDefaultDataSubId(subId);
}