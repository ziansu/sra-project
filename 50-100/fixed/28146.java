public void DeleteClaim(java.lang.String claimID) {
    if (persistanceController.DataManager.isNetworkAvailable()) {
        new persistanceModel.DeleteASyncTask().execute(claimID);
    }
    local.saveClaims(ca.ualberta.cmput301w15t13.Controllers.ClaimListSingleton.getClaimList().getClaimArrayList(), persistanceController.DataManager.getCurrentContext());
}