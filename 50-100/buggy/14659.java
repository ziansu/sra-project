public void queryInventory(java.util.List<java.lang.String> moreItemSkus) throws com.sandbox.IAPHelper.IabException {
    check_not_disposed();
    check_setup_done("queryInventory");
    try {
        int r = querySkuDetails(com.sandbox.IAPHelper.ITEM_TYPE_INAPP, moreItemSkus);
        if (r != (com.sandbox.IAPHelper.BILLING_RESPONSE_RESULT_OK)) {
            throw new com.sandbox.IAPHelper.IabException(r, "Error refreshing inventory (querying prices of items).");
        }
        return ;
    } catch (android.os.RemoteException e) {
        throw new com.sandbox.IAPHelper.IabException(com.sandbox.IAPHelper.IABHELPER_REMOTE_EXCEPTION, "Remote exception while refreshing inventory.", e);
    }
}