@java.lang.Override
public org.spongepowered.api.text.Text getOwnerName() {
    if ((this.isAdminClaim()) || (this.isWilderness())) {
        return GriefPreventionPlugin.instance.messageData.ownerAdmin.toText();
    }
    if (this.isSubdivision()) {
        return this.parent.getOwnerName();
    }
    if ((this.getOwnerPlayerData()) == null) {
        return org.spongepowered.api.text.Text.of("[unknown]");
    }
    return org.spongepowered.api.text.Text.of(this.getOwnerPlayerData().getPlayerName());
}