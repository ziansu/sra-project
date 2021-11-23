@java.lang.Override
public data.Card getCardFromCompetitor(java.lang.String gameId, java.lang.String playerId) {
    model.Game game = map.get(java.util.UUID.fromString(gameId));
    if (!(game.getStatus().getGameState().equals(GameState.WaitForCommit))) {
        throw new java.lang.IllegalStateException();
    }
    if (java.util.UUID.fromString(playerId).equals(game.getPlayer1ID())) {
        return cards[game.getPlayer2Card()];
    }else {
        return null;
    }
}