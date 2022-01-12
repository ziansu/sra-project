@java.lang.Override
public void takeTurn() {
    java.lang.System.out.println("Computer turn");
    gameState.TurnChange ts = turnSwitch;
    int i = turnSwitch.getComputer().getSelectedPokemon().getCurrentHealth();
    if ((turnSwitch.getComputer().getSelectedPokemon().getCurrentHealth()) <= 0) {
        turnSwitch.setTurn(turnSwitch.getComputerPokemon());
    }else {
        turnSwitch.setTurn(turnSwitch.getComputerFight());
    }
}