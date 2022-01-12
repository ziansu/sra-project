@net.slipcor.pvparena.listeners.EventHandler(priority = EventPriority.HIGHEST)
public void onPlayerRespawn(final net.slipcor.pvparena.listeners.PlayerRespawnEvent event) {
    final org.bukkit.entity.Player player = event.getPlayer();
    final net.slipcor.pvparena.arena.ArenaPlayer aPlayer = net.slipcor.pvparena.arena.ArenaPlayer.parsePlayer(player.getName());
    aPlayer.setArena(null);
    aPlayer.readDump();
    final net.slipcor.pvparena.arena.Arena arena = aPlayer.getArena();
    if (arena != null) {
        arena.playerLeave(player, CFG.TP_EXIT, true);
    }
}