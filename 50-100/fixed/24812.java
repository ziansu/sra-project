@org.bukkit.event.EventHandler
public void onArrowHitPlayer(org.bukkit.event.entity.EntityDamageEvent event) {
    if ((event.getEntity()) instanceof org.bukkit.entity.Player) {
        org.bukkit.Bukkit.broadcastMessage("HIT");
        org.bukkit.entity.Player victim = ((org.bukkit.entity.Player) (event.getEntity()));
        if (org.kwstudios.play.ragemode.gameLogic.PlayerList.isPlayerPlaying(victim.getUniqueId().toString())) {
            org.bukkit.Bukkit.broadcastMessage("DDD");
            event.setDamage(25);
        }
    }
}