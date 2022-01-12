public void reloadGameType() {
    net.samongi.PersistantPvP.PersistantPvP.log((("Disabling GameType: '" + (this.current_gametype.getDisplayName())) + "'"));
    this.current_gametype.onTypeDisable();
    net.samongi.PersistantPvP.PersistantPvP.log((("Enabling GameType: '" + (this.current_gametype.getDisplayName())) + "'"));
    this.current_gametype.onTypeEnable();
}