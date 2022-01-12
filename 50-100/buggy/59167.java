public void setRank(java.util.UUID uuid, com.sensationcraft.sccore.ranks.Rank rank) {
    if (this.players.containsKey(uuid)) {
        this.players.replace(uuid, rank);
        return ;
    }
    if ((org.bukkit.Bukkit.getPlayer(uuid)) != null) {
        this.players.put(uuid, rank);
        return ;
    }
    this.setSQLRank(uuid, rank);
}