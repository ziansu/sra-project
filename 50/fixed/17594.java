@java.lang.Override
public boolean isCompleted(java.util.UUID playerID) {
    org.bukkit.entity.Player p = org.bukkit.Bukkit.getPlayer(playerID);
    return (this.loc.distance(p.getLocation())) <= (this.radius);
}