private void syncCategories(java.lang.String categoriesString, boolean newIdsNeeded) {
    java.lang.String loftToken = getLoftToken();
    java.lang.String googleToken = getGoogleToken();
    if (mNetworkStatusChecker.isNetworkAvailable()) {
        com.valevich.moneytracker.network.rest.model.CategoriesSyncModel apiCategories = mRestService.syncCategories(categoriesString, loftToken, googleToken);
        java.lang.String status = apiCategories.getStatus();
        switch (status) {
            case com.valevich.moneytracker.utils.ConstantsManager.STATUS_SUCCESS :
                if (newIdsNeeded)
                    setNewCategoryIds(apiCategories);
                
                break;
            default :
                reLogInAndTryAgain();
                break;
        }
    }
}