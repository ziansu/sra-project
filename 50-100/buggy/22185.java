@org.bukkit.event.EventHandler
public void resetOnDeath(org.bukkit.event.entity.PlayerDeathEvent e) {
    org.bukkit.entity.Player p = e.getEntity();
    for (int i = 0; i < (al.size()); i++) {
        if (al.get(i).getName().equals(p.getName())) {
            al.get(i).reset();
        }
    }
}