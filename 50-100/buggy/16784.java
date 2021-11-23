public void saveAndUnload(net.daboross.bukkitdev.skywars.SkyWarsPlugin plugin) {
    net.daboross.bukkitdev.skywars.api.game.SkyGameHandler handler = plugin.getGameHandler();
    while (!(currentGames.isEmpty())) {
        int id = currentGames.keySet().iterator().next();
        handler.endGame(id, false);
    } 
}