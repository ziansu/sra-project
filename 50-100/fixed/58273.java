@java.lang.Override
public void execute(antgameproject.Board gameBoard, antgameproject.Ant currentAnt) {
    if (currentAnt.getCarryingFood()) {
        antgameproject.Pos antPosition = currentAnt.getBoardPosition();
        gameBoard.setFoodAt(antPosition, ((gameBoard.numberOfFoodAt(antPosition)) + 1));
        currentAnt.setCarryingFood(false);
    }
    currentAnt.setBrainState(nextState);
}