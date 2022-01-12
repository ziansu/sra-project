public boolean hasFullAccess(org.spongepowered.api.entity.living.player.User user) {
    me.ryanhamshire.griefprevention.PlayerData playerData = GriefPrevention.instance.dataStore.getPlayerData(this.world, user.getUniqueId());
    if ((playerData != null) && (playerData.ignoreClaims)) {
        return true;
    }
    if (user.getUniqueId().equals(this.ownerID)) {
        if (playerData.debugClaimPermissions) {
            return false;
        }
        return true;
    }
    if ((this.parent) != null) {
        return this.parent.hasFullAccess(user);
    }
    return false;
}