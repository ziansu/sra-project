@java.lang.Deprecated
public void addValue(int id, java.lang.String name) {
    if (((name.length()) > 0) && (Bukkit.getOfflinePlayer(name).hasPlayedBefore())) {
        this.addValue(id, name, Bukkit.getOfflinePlayer(name).getUniqueId());
    }else
        this.addValue(id, name, java.util.UUID.randomUUID());
    
}