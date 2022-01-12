@org.bukkit.event.EventHandler
public void onLogin(com.minegusta.mgracesredone.listeners.racelisteners.PlayerJoinEvent e) {
    com.minegusta.mgracesredone.listeners.racelisteners.Player joined = e.getPlayer();
    for (java.lang.String s : com.minegusta.mgracesredone.listeners.racelisteners.ShadowInvisibility.values()) {
        com.minegusta.mgracesredone.listeners.racelisteners.Player p = org.bukkit.Bukkit.getPlayer(java.util.UUID.fromString(s));
        joined.hidePlayer(p);
        org.bukkit.Bukkit.getLogger().info("Hiding players for invisibility.");
    }
}