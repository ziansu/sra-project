@java.lang.Deprecated
public void addValue(int id, java.lang.String name) {
    java.util.UUID uuid;
    if (((name.length()) > 0) && (Bukkit.getOfflinePlayer(name).hasPlayedBefore())) {
        uuid = Bukkit.getOfflinePlayer(name).getUniqueId();
    }else
        uuid = java.util.UUID.randomUUID();
    
    this.addValue(id, name, uuid);
}