public void reloadGameType() {
    if ((this.current_gametype) == null)
        return ;
    
    net.samongi.PersistantPvP.PersistantPvP.log((("Disabling GameType: '" + (this.current_gametype.getDisplayName())) + "'"));
    this.current_gametype.onTypeDisable();
    net.samongi.PersistantPvP.PersistantPvP.log((("Enabling GameType: '" + (this.current_gametype.getDisplayName())) + "'"));
    this.current_gametype.onTypeEnable();
}