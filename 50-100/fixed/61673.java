public void playerJoined(org.bukkit.entity.Player p) {
    for (org.bukkit.entity.Player x : org.bukkit.Bukkit.getOnlinePlayers())
        if (!(x.equals(p))) {
            x.showPlayer(p);
            p.showPlayer(x);
        }
    
    if (!(p.hasPermission("Necessities.seehidden")))
        for (java.util.UUID uuid : com.crossge.necessities.Commands.CmdHide.hidden)
            if ((org.bukkit.Bukkit.getPlayer(uuid)) != null)
                p.hidePlayer(org.bukkit.Bukkit.getPlayer(uuid));
            
        
    
}