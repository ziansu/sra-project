public void addSCPlayer(java.util.UUID uuid) {
    if (this.scPlayers.containsKey(uuid))
        return ;
    
    this.scPlayers.put(uuid, new com.sensationcraft.sccore.scplayer.SCPlayer(this.instance, uuid));
    this.rankManager.setRank(uuid, this.rankManager.getRank(uuid));
    this.permissionsManager.setAttachment(org.bukkit.Bukkit.getPlayer(uuid));
    this.statsManager.loadStats(uuid);
}