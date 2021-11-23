public static void joinArena(ml.lasertag.minigame.Core core, ml.lasertag.minigame.GameManager.Arena arena, org.bukkit.entity.Player player) {
    arena.addPlayer(player);
    arena.broadcastMessage(((((ml.lasertag.minigame.Core.joinMessage) + "§6") + (player.getName())) + " §7has joined the game!"));
    ml.lasertag.minigame.GameManager.Bukkit.getPluginManager().callEvent(new ml.lasertag.minigame.events.ArenaInteractEvent(ArenaInteractEvent.ArenaAction.JOIN, arena));
}