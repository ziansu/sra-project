public void onIabPurchaseFinished(com.pyrotemplar.inappbilling.util.IabResult result, com.pyrotemplar.inappbilling.util.Purchase purchase) {
    if ((result.getResponse()) == 7) {
        isAdsFreeModeEnabled = true;
    }
    if (result.isFailure()) {
        adsAlreadyRemovedPromp();
        return ;
    }else
        if (purchase.getSku().equals(com.pyrotemplar.kickballreferee.Settings.ITEM_SKU)) {
            isAdsFreeModeEnabled = true;
        }
    
}