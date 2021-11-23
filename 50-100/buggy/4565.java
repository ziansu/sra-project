private void processCard(com.valeriisosliuk.game.model.Game game, com.valeriisosliuk.game.model.Card card) {
    com.valeriisosliuk.game.model.Player player = game.getActivePlayer();
    player.removeCard(card);
    player.getActiveState().addCurrentTurnCard(card);
    game.getCardHolder().putCardInDiscard(card);
    java.util.Set<com.valeriisosliuk.game.model.Card> nextTurnOptions = turnAdvisor.getValidCardsForTurn(game.getActivePlayer().getHand(), game.getCardHolder().getLastCardInDiscard(), false);
    game.getActivePlayer().getActiveState().setTurnOptions(nextTurnOptions);
}