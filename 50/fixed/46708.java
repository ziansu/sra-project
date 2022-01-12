@java.lang.Override
public void run() {
    if ((org.bukkit.Bukkit.getPlayer(uuid)) != null)
        org.bukkit.Bukkit.getPlayer(uuid).removeMetadata("wild.Cooldown", WildTP.instace);
    
}