public void setRank(java.util.UUID uuid, com.sensationcraft.sccore.ranks.Rank rank) {
    if (this.players.containsKey(uuid)) {
        this.players.replace(uuid, rank);
        return ;
    }
    this.players.put(uuid, rank);
    this.setSQLRank(uuid, rank);
}