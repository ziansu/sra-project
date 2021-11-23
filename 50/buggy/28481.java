@java.lang.Override
public void change(entities.Game game) {
    java.lang.System.out.println("");
    java.lang.System.out.println("PreFlop");
    game.setPhase(this);
    game.startNewRound();
}