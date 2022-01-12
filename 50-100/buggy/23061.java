@java.lang.Override
public void change(entities.Game game) {
    java.lang.System.out.println("Turn");
    game.setPhase(this);
    if (game.isLastPlayerLeft())
        new states.River().change(game);
    else {
        game.resetPhaseTurns();
        game.retrieveTableCards(1);
    }
}