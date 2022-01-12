public void save() {
    for (me.ryanhamshire.griefprevention.api.claim.Claim claim : this.worldClaims) {
        me.ryanhamshire.griefprevention.claim.GPClaim gpClaim = ((me.ryanhamshire.griefprevention.claim.GPClaim) (claim));
        if (gpClaim.getInternalClaimData().requiresSave()) {
            gpClaim.updateClaimStorageData();
            gpClaim.getClaimStorage().save();
            gpClaim.getInternalClaimData().setRequiresSave(false);
        }
    }
    for (me.ryanhamshire.griefprevention.GPPlayerData playerData : this.getPlayerDataMap().values()) {
        playerData.getStorageData().save();
    }
}