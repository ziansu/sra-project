public java.lang.String LoadLocalClaims() {
    if (!(persistanceController.DataManager.isNetworkAvailable())) {
        local.LoadClaims();
    }
    return null;
}