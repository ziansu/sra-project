public void loadClaimsByUserName(java.lang.String userName) {
    if (persistanceController.DataManager.isNetworkAvailable()) {
        new persistanceModel.LoadASyncTask().execute(userName);
    }else {
        local.LoadClaims(persistanceController.DataManager.getCurrentContext());
    }
}