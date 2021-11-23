public void loadClaimsByUserName(java.lang.String userName) {
    this.isNetworkConnected();
    if (persistanceController.DataManager.isNetworkAvailable()) {
        new persistanceModel.LoadASyncTask().execute(userName);
    }else {
        local.LoadClaims(persistanceController.DataManager.getCurrentContext());
    }
}