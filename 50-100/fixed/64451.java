public void save() {
    for (me.ryanhamshire.griefprevention.api.claim.Claim claim : this.worldClaims) {
        me.ryanhamshire.griefprevention.claim.GPClaim gpClaim = ((me.ryanhamshire.griefprevention.claim.GPClaim) (claim));
        gpClaim.save();
    }
    for (me.ryanhamshire.griefprevention.GPPlayerData playerData : this.getPlayerDataMap().values()) {
        playerData.getStorageData().save();
    }
}