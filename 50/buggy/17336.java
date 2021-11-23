@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.LOWEST)
public void playerQuitEvent(org.bukkit.event.player.PlayerQuitEvent event) {
    org.bukkit.entity.Player p = event.getPlayer();
    java.util.UUID uuid = p.getUniqueId();
    db.playerQuitServer(uuid);
    st.save(p, st.getInvIdentifier(uuid), true);
}