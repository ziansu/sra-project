public void disable() {
    disabled = true;
    spawns.clear();
    java.util.ListIterator<org.bukkit.entity.Player> players = activePlayers.listIterator();
    while (players.hasNext()) {
        org.bukkit.entity.Player p = players.next();
        com.endercrest.colorcube.game.MessageManager.getInstance().sendFMessage("game.status", p, "state-disabled");
    } 
    endGame();
    status = com.endercrest.colorcube.game.Game.Status.DISABLED;
    com.endercrest.colorcube.game.MessageManager.getInstance().debugConsole((("Arena " + (id)) + " disabled"));
}