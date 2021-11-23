public synchronized void makePlayerActive(brownshome.scriptwars.server.game.Player player) {
    if ((activePlayers.size()) >= (game.getMaximumPlayers())) {
        try {
            sendError(player, ("That game is full, here is a new ID " + (game.getType().getUserID())));
        } catch (brownshome.scriptwars.server.game.GameCreationException e) {
            sendError(player, "That game is full and we were unable to generate a new ID");
        }
        return ;
    }
    player.setActive(true);
    activePlayers.add(player);
    game.addPlayer(player);
}