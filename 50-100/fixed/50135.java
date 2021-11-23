public void saveClaim(ca.ualberta.cmput301w15t13.Models.Claim claim) {
    if (persistanceController.DataManager.isNetworkAvailable()) {
        new persistanceModel.SaveASyncTask().execute(claim.getclaimID());
    }
    local.saveClaims(ca.ualberta.cmput301w15t13.Controllers.ClaimListSingleton.getClaimList().getClaimArrayList(), persistanceController.DataManager.getCurrentContext());
}