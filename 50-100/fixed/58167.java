@net.slipcor.pvparena.listeners.EventHandler(priority = EventPriority.HIGHEST)
public void onPlayerKicked(final net.slipcor.pvparena.listeners.PlayerKickEvent event) {
    final org.bukkit.entity.Player player = event.getPlayer();
    final net.slipcor.pvparena.arena.Arena arena = net.slipcor.pvparena.arena.ArenaPlayer.parsePlayer(player.getName()).getArena();
    if (arena == null) {
        return ;
    }
    arena.playerLeave(player, CFG.TP_EXIT, false, true);
}