@java.lang.Override
public void onDisable() {
    playerHandler.getTagTask().cancel();
    for (final me.NoChance.PvPManager.PvPlayer p : playerHandler.getPlayers().values()) {
        if (p.isInCombat())
            p.unTag();
        
        playerHandler.savePvPState(p.getUUID(), p.hasPvPEnabled());
    }
    playerHandler.removeTeams();
}