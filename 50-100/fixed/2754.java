public boolean imprisonPlayer(java.lang.String playerName) {
    if (!(getPrison().isOperational())) {
        return false;
    }
    playerName = playerName.toLowerCase();
    this.imprisonedPlayers.add(playerName);
    org.bukkit.entity.Player player = org.bukkit.Bukkit.getPlayerExact(playerName);
    if ((isActive) && (player != null)) {
        player.teleport(this.location);
    }
    this.setChanged("imprisonedPlayers");
    return true;
}