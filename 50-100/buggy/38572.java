public boolean calculateIslandLevel(java.util.UUID playerUUID) {
    if ((plugin.getPlayers().inTeam(playerUUID)) && (!(plugin.getPlayers().hasIsland(playerUUID)))) {
        new com.wasteofplastic.askyblock.LevelCalcByChunk(plugin, playerUUID, null, true);
        return true;
    }
    return false;
}