public void add(ca.ualberta.cmput301w15t13.Models.Claim claim) {
    if (!(claimList.contains(claim))) {
        claimList.add(claim);
        persistanceController.DataManager.saveClaim(claim);
    }
}