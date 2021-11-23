private void reLogInAndTryAgain() {
    if (mNetworkStatusChecker.isNetworkAvailable()) {
        com.valevich.moneytracker.network.rest.model.UserLogoutModel userLogoutModel = mRestService.logout();
        java.lang.String status = userLogoutModel.getStatus();
        switch (status) {
            case com.valevich.moneytracker.utils.ConstantsManager.STATUS_EMPTY :
                logIn();
                com.valevich.moneytracker.network.sync.TrackerSyncAdapter.syncImmediately(getContext(), false);
                break;
            case com.valevich.moneytracker.utils.ConstantsManager.STATUS_SUCCESS :
                logIn();
                com.valevich.moneytracker.network.sync.TrackerSyncAdapter.syncImmediately(getContext(), false);
                break;
            default :
                break;
        }
    }
}