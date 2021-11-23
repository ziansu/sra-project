public boolean isSubscriptionUpdateSupported() {
    if (isSubsUpdateSupported)
        return true;
    
    try {
        int response = billingService.isBillingSupported(Constants.GOOGLE_API_SUBSCRIPTION_CHANGE_VERSION, contextPackageName, Constants.PRODUCT_TYPE_SUBSCRIPTION);
        isSubsUpdateSupported = response == (Constants.BILLING_RESPONSE_RESULT_OK);
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    }
    return isSubsUpdateSupported;
}