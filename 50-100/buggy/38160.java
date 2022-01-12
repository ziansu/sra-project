@java.lang.Deprecated
public void addValue(int id, java.lang.String name) {
    java.util.UUID uuid;
    OfflinePlayer p = Bukkit.getOfflinePlayer(name);
    if (p.hasPlayedBefore())
        uuid = p.getUniqueId();
    else
        uuid = java.util.UUID.randomUUID();
    
    this.addValue(id, name, uuid);
}