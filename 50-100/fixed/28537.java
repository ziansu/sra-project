public org.bukkit.OfflinePlayer getOfflinePlayer(java.lang.String Name) {
    if (Name == null)
        return null;
    
    org.bukkit.OfflinePlayer offPlayer = OfflinePlayerList.get(Name.toLowerCase());
    if (offPlayer != null)
        return offPlayer;
    
    org.bukkit.entity.Player player = org.bukkit.Bukkit.getPlayer(Name);
    if (player != null)
        return player;
    
    return offPlayer;
}