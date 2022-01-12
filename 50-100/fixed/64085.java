@java.lang.Override
public synchronized void concede(java.util.UUID playerId) {
    mage.players.Player player = state.getPlayer(playerId);
    if (player != null) {
        mage.game.GameImpl.logger.debug(((("Player " + (player.getName())) + " concedes game ") + (this.getId())));
        fireInformEvent(((player.getLogName()) + " has conceded."));
        player.concede(this);
    }
}