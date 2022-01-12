private void initializePurchases() {
    mHelper.startSetup(new org.onepf.oms.appstore.googleUtils.IabHelper.OnIabSetupFinishedListener() {
        public void onIabSetupFinished(org.onepf.oms.appstore.googleUtils.IabResult result) {
            if (!(result.isSuccess())) {
                showToast(("Problem setting up in-app billing: " + result));
                return ;
            }
            if ((mHelper) == null)
                return ;
            
            mHelper.queryInventoryAsync(mGotInventoryListener);
        }
    });
}