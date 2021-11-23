@java.lang.Override
public void change(entities.Game game) {
    game.setPhase(this);
    game.startNewRound();
}