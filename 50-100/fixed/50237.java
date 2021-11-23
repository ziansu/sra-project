@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.NORMAL)
public void onPlayerChatEvent(org.bukkit.event.player.AsyncPlayerChatEvent event) {
    if ((summon.isSummoned(event.getPlayer())) && (!(summon.getSummon(event.getPlayer()).getCanSpeak()))) {
        event.setCancelled(true);
    }
}