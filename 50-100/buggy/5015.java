@java.lang.Override
public void change(entities.Game game) {
    java.lang.System.out.println("Flop");
    game.setPhase(this);
    if (game.isLastPlayerLeft())
        new states.Turn().change(game);
    else {
        game.resetPhaseTurns();
        game.retrieveTableCards(3);
    }
}