@org.bukkit.event.EventHandler
public void resetStatsOnLogIn(org.bukkit.event.player.PlayerLoginEvent e) {
    org.bukkit.entity.Player p = e.getPlayer();
    for (int i = 0; i < (al.size()); i++) {
        if (al.get(i).getName().equals(p.getName()))
            al.get(i).reset();
        
    }
}