@java.lang.Override
public void change(entities.Game game) {
    game.setPhase(this);
    if (game.isLastPlayerLeft())
        new states.River().change(game);
    else {
        game.resetPhaseTurns();
        game.retrieveTableCards(1);
    }
}