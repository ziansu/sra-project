private void reLogInAndTryAgain() {
    if (mNetworkStatusChecker.isNetworkAvailable()) {
        com.valevich.moneytracker.network.rest.model.UserLogoutModel userLogoutModel = mRestService.logout();
        java.lang.String status = userLogoutModel.getStatus();
        switch (status) {
            case com.valevich.moneytracker.utils.ConstantsManager.STATUS_EMPTY :
                logIn();
                break;
            case com.valevich.moneytracker.utils.ConstantsManager.STATUS_SUCCESS :
                logIn();
                break;
            default :
                break;
        }
    }
}