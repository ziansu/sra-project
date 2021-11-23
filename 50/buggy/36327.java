public void storePlayer(java.util.UUID uuid, java.lang.String username) {
    org.bukkit.entity.Player p = new org.bukkit.entity.Player(uuid.toString(), username);
    this.storePlayer(p);
}