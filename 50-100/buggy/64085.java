@java.lang.Override
public synchronized void concede(java.util.UUID playerId) {
    mage.players.Player player = state.getPlayer(playerId);
    if (player != null) {
        mage.game.GameImpl.logger.debug(new java.lang.StringBuilder("Player ").append(player.getName()).append(" concedes game ").append(this.getId()));
        fireInformEvent(((player.getLogName()) + " has conceded."));
        player.concede(this);
    }
}