@org.bukkit.event.EventHandler
public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
    java.lang.String board = LeCorePlugin.plugin.worldBoards.get(e.getPlayer().getWorld().getName());
    if (board.equals("Hub")) {
        new com.nekomc.nekoBoard.Hub().showPlayer(e.getPlayer().getUniqueId());
    }
    pm.callEvent(new customEvents.GeneralScoreboardUpdateEvent());
}